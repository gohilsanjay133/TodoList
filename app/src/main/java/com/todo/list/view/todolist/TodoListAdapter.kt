package com.todo.list.view.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.todo.list.data.db.model.TodoListData
import com.todo.list.databinding.ItemTodoListBinding
import com.todo.list.interfaces.DeleteAndTaskCompletionTodoItemClickListener


class TodoListAdapter(
    private val mTodoList: MutableList<TodoListData>,
    private val deleteAndTaskCompletionTodoItemClickListener: DeleteAndTaskCompletionTodoItemClickListener
) :
    RecyclerView.Adapter<TodoListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        return TodoListViewHolder(
            ItemTodoListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        holder.bind(mTodoList[position], deleteAndTaskCompletionTodoItemClickListener)
    }

    override fun getItemCount(): Int {
        return mTodoList.size
    }

    fun mUpdateList(mNewBatList: ArrayList<TodoListData>) {
        val mSelectBatDiffResult =
            DiffUtil.calculateDiff(TodoListDiffCallback(mTodoList, mNewBatList))
        mTodoList.clear()
        mTodoList.addAll(mNewBatList)
        mSelectBatDiffResult.dispatchUpdatesTo(this)
    }

}