package com.todo.list.view.todolist

import androidx.annotation.Nullable
import androidx.recyclerview.widget.DiffUtil
import com.todo.list.data.db.model.TodoListData

class TodoListDiffCallback(
    private val oldList: List<TodoListData>,
    private val newList: List<TodoListData>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        val oldRecordsItem = oldList[oldPosition]
        val newRecordItem = newList[newPosition]
        return oldRecordsItem == newRecordItem && oldRecordsItem.completionStatus == newRecordItem.completionStatus

    }

    @Nullable
    override fun getChangePayload(oldPosition: Int, newPosition: Int): Any? {
        return super.getChangePayload(oldPosition, newPosition)
    }
}