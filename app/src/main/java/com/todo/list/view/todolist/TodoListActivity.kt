package com.todo.list.view.todolist

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.todo.list.R
import com.todo.list.data.db.model.TodoListData
import com.todo.list.databinding.ActivityTodoListBinding
import com.todo.list.dialog.DeleteTodoConfirmationDialog
import com.todo.list.interfaces.DeleteAndTaskCompletionTodoItemClickListener
import com.todo.list.interfaces.DeleteConfirmationDialogListener
import com.todo.list.interfaces.MoreOptionItemClickListener
import com.todo.list.util.hide
import com.todo.list.util.show
import com.todo.list.view.addtask.AddTaskActivity
import com.todo.list.view.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@AndroidEntryPoint
class TodoListActivity : BaseActivity<ActivityTodoListBinding>(),
    MoreOptionItemClickListener,
    DeleteAndTaskCompletionTodoItemClickListener {

    @Inject
    lateinit var todoListViewModelFactory: TodoListViewModelFactory

    private val todoListViewModel: TodoListViewModel by lazy {
        ViewModelProvider(this, todoListViewModelFactory)[TodoListViewModel::class.java]
    }

    private lateinit var todoListAdapter: TodoListAdapter
    private val mTodoList = ArrayList<TodoListData>()


    override fun setBinding(layoutInflater: LayoutInflater) =
        ActivityTodoListBinding.inflate(layoutInflater)


    override fun initView() {
        mInitClickEvent()
        mInitRecyclerview()
        mManageToolbar(binding.includeLayToolbar, "", true, R.drawable.ic_more, this)
    }

    private fun mInitClickEvent() {
        binding.fabAddTask.setOnClickListener {
            startNewActivity(AddTaskActivity::class.java)
        }
    }

    private fun mInitRecyclerview() {
        todoListAdapter = TodoListAdapter(mTodoList.toMutableList(), this)
        binding.rvTodoList.apply {
            layoutManager = LinearLayoutManager(this@TodoListActivity)
            adapter = todoListAdapter
            itemAnimator = null
            setHasFixedSize(false)
        }
    }

    private fun mInitTodoList() {
        lifecycleScope.launch(Dispatchers.IO) {
            mTodoList.clear()
            mTodoList.addAll(todoListViewModel.mGetTodoList())
            withContext(Dispatchers.Main) {
                if (mTodoList.isEmpty()) {
                    binding.rvTodoList.hide()
                    binding.imgNoTodoList.show()
                    binding.tvTaskFound.show()
                } else {
                    binding.rvTodoList.show()
                    binding.imgNoTodoList.hide()
                    binding.tvTaskFound.hide()
                    todoListAdapter.mUpdateList(mTodoList)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mInitTodoList()
    }


    override fun onClick() {
        showPopupMenu(binding.includeLayToolbar.imgMoreOption)
    }

    override fun onClick(todoListData: TodoListData) {
        DeleteTodoConfirmationDialog(
            this@TodoListActivity,
            todoListData.name,
            object :
                DeleteConfirmationDialogListener {
                override fun onClick() {
                    mDeleteTodoItem(todoListData)
                }
            }).show()
    }

    override fun onTaskCompletion(todoListData: TodoListData) {
        lifecycleScope.launch(Dispatchers.IO) {
            val mPosition = mTodoList.indexOf(todoListData)
            val mSelectedBatCopy =
                todoListData.copy(completionStatus = !todoListData.completionStatus)
            todoListViewModel.mSaveTodoList(mSelectedBatCopy)
            withContext(Dispatchers.Main) {
                mTodoList[mPosition] = mSelectedBatCopy
                todoListAdapter.mUpdateList(mTodoList)
            }
        }
    }

    private fun mDeleteTodoItem(todoListData: TodoListData) {
        lifecycleScope.launch(Dispatchers.IO) {
            todoListViewModel.mDeleteTodoItem(todoListData)
            withContext(Dispatchers.Main) {
                mTodoList.remove(todoListData)
                todoListAdapter.mUpdateList(mTodoList)
                manageError(getString(R.string.item_deleted_successfully), binding.root)
            }
        }
    }

    private fun showPopupMenu(
        view: View
    ) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.inflate(R.menu.more_option)
        popupMenu.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId) {
                R.id.menuSortByAscending -> {
                    val mTemSortByAscendingTodoList = ArrayList<TodoListData>()
                    mTemSortByAscendingTodoList.addAll(mTodoList.sortedBy { it.completionDeadline })
                    todoListAdapter.mUpdateList(mTemSortByAscendingTodoList)
                    true
                }

                R.id.menuSortByDescending -> {
                    val mTemSortByDescendingTodoList = ArrayList<TodoListData>()
                    mTemSortByDescendingTodoList.addAll(mTodoList.sortedByDescending { it.completionDeadline })
                    todoListAdapter.mUpdateList(mTemSortByDescendingTodoList)
                    true
                }

                R.id.reset -> {
                    todoListAdapter.mUpdateList(mTodoList)
                    true
                }

                else -> super.onOptionsItemSelected(item)
            }
        }
        popupMenu.show()
    }

}