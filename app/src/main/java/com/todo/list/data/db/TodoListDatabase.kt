package com.todo.list.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.todo.list.data.db.dao.TodoListDAO
import com.todo.list.data.db.model.TodoListData

@Database(
    entities = [TodoListData::class],
    version = 1,
    exportSchema = true
)

abstract class TodoListDatabase : RoomDatabase() {
    abstract fun getTodoListDAO(): TodoListDAO
}

