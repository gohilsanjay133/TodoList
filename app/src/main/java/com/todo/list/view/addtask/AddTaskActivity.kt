package com.todo.list.view.addtask

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.todo.list.R
import com.todo.list.data.db.model.TodoListData
import com.todo.list.databinding.ActivityAddTaskBinding
import com.todo.list.util.PastValidator
import com.todo.list.util.TimeFormatter
import com.todo.list.util.Utility
import com.todo.list.view.base.BaseActivity
import com.todo.list.view.todolist.TodoListViewModel
import com.todo.list.view.todolist.TodoListViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Calendar
import javax.inject.Inject

@AndroidEntryPoint
class AddTaskActivity : BaseActivity<ActivityAddTaskBinding>() {

    @Inject
    lateinit var addTaskViewModelFactory: TodoListViewModelFactory

    private val addTaskViewModel: TodoListViewModel by lazy {
        ViewModelProvider(this, addTaskViewModelFactory)[TodoListViewModel::class.java]
    }

    private lateinit var selectedCalendar: Calendar


    override fun setBinding(layoutInflater: LayoutInflater) =
        ActivityAddTaskBinding.inflate(layoutInflater)


    override fun initView() {
        selectedCalendar = Calendar.getInstance()
        mInitClickEvent()
        mManageToolbar(binding.toolbarAddTask, getString(R.string.add_a_task), false, 0, null)
    }

    private fun mInitClickEvent() {
        binding.btnCancel.setOnClickListener {
            finish()
        }
        binding.btnAdd.setOnClickListener {
            mValidateAndSaveTask()
        }
        binding.tilSelectDateTime.setOnClickListener {
            showDateTimePicker()
        }
        binding.etTaskTime.setOnClickListener {
            showDateTimePicker()
        }
    }

    private fun showDateTimePicker() {
        val currentDate = Calendar.getInstance().timeInMillis
        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setTitleText("Select task completion date")
            .setCalendarConstraints(
                createDatePickerConstraints(currentDate)
            )
            .setSelection(currentDate)
            .build()

        datePicker.addOnPositiveButtonClickListener { selection ->
            val selectedDate = selection as Long
            selectedCalendar.timeInMillis = selectedDate
            val timePicker = MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_12H)
                .setTitleText("Select task completion time")
                .setHour(selectedCalendar.get(Calendar.HOUR_OF_DAY))
                .setMinute(selectedCalendar.get(Calendar.MINUTE))
                .build()
            timePicker.addOnPositiveButtonClickListener {
                val selectedHour = timePicker.hour
                val selectedMinute = timePicker.minute
                selectedCalendar.set(Calendar.HOUR_OF_DAY, selectedHour)
                selectedCalendar.set(Calendar.MINUTE, selectedMinute)
                val currentTime = Calendar.getInstance()
                if (selectedCalendar.before(currentTime)) {
                    manageError(getString(R.string.selected_time_is_past), binding.root)
                } else {
                    binding.etTaskTime.setText(
                        TimeFormatter.TODO_DATE_FORMAT.format(
                            selectedCalendar.time
                        )
                    )
                }
            }

            timePicker.show(supportFragmentManager, "timePicker")
        }

        datePicker.show(supportFragmentManager, "datePicker")
    }

    private fun createDatePickerConstraints(currentDate: Long): CalendarConstraints {
        val constraintsBuilder = CalendarConstraints.Builder()
        constraintsBuilder.setStart(currentDate)
        constraintsBuilder.setValidator(PastValidator(currentDate))
        return constraintsBuilder.build()
    }


    private fun mValidateTodo(): Boolean {
        val mTaskTitle = binding.etTaskTitle.text.toString()
        val mTaskDateTime = binding.etTaskTime.text.toString()
        return if (mTaskTitle.isEmpty())
            manageError(getString(R.string.enter_task_title), binding.root)
        else if (mTaskDateTime.isEmpty())
            manageError(getString(R.string.please_select_date_time), binding.root)
        else
            true

    }

    private fun mValidateAndSaveTask() {
        if (mValidateTodo()) {
            lifecycleScope.launch(Dispatchers.IO) {
                val mTaskTitle = binding.etTaskTitle.text.toString()
                val mTodoTaskData = TodoListData(
                    name = mTaskTitle,
                    completionStatus = false,
                    completionDeadline = selectedCalendar.timeInMillis
                )
                selectedCalendar = Calendar.getInstance()
                addTaskViewModel.mSaveTodoList(mTodoTaskData)
                withContext(Dispatchers.Main) {
                    binding.etTaskTime.setText("")
                    binding.etTaskTitle.setText("")
                    Utility.hideSoftKeyboard(this@AddTaskActivity, binding.root)
                    manageError(getString(R.string.task_added_success_fully), binding.root)
                }
            }

        }
    }


}