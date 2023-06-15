package com.todo.list.view.todolist

import android.graphics.Paint
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.todo.list.R
import com.todo.list.data.db.model.TodoListData
import com.todo.list.databinding.ItemTodoListBinding
import com.todo.list.interfaces.DeleteAndTaskCompletionTodoItemClickListener
import com.todo.list.util.TimeFormatter
import com.todo.list.util.hide
import com.todo.list.util.show
import java.util.Date


class TodoListViewHolder(private val binding: ItemTodoListBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(
        todoListData: TodoListData,
        deleteAndTaskCompletionTodoItemClickListener: DeleteAndTaskCompletionTodoItemClickListener
    ) {
        val context = binding.root.context
        binding.tvTodoName.text = todoListData.name
        binding.tvTodoName.paintFlags =
            binding.tvTodoName.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        binding.tvTodoName.setTextColor(
            ContextCompat.getColor(context, R.color.todo_item_color)
        )
        binding.tvTodoStatus.hide()
        if (todoListData.completionStatus) {
            binding.tvTodoName.paintFlags =
                binding.tvTodoName.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            val isTodoExpire = todoListData.mIsTodoExpire()
            if (isTodoExpire) {
                binding.tvTodoStatus.show()
                binding.tvTodoName.setTextColor(
                    ContextCompat.getColor(context, R.color.status_pending_color)
                )
            }
        }

        binding.cbMarkAsAComplete.isChecked = todoListData.completionStatus
        binding.cbMarkAsAComplete.setOnCheckedChangeListener { _, _ ->
            deleteAndTaskCompletionTodoItemClickListener.onTaskCompletion(todoListData)
        }
        binding.tvTodoExpireTime.text =
            TimeFormatter.DISPLAY_DATE_FORMAT.format(Date(todoListData.completionDeadline))
        binding.imgDeleteTodo.setOnClickListener {
            deleteAndTaskCompletionTodoItemClickListener.onClick(todoListData)
        }
    }
}