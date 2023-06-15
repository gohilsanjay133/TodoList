package com.todo.list.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "TodoList"
)
data class TodoListData(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0,

    @ColumnInfo(name = "name")
    val name: String = "",

    @ColumnInfo(name = "completionStatus")
    val completionStatus: Boolean = false,

    @ColumnInfo(name = "completionDeadline")
    val completionDeadline: Long,
) {
    fun mIsTodoExpire(): Boolean {
        val currentTime = System.currentTimeMillis()
        return completionDeadline < currentTime
    }
}