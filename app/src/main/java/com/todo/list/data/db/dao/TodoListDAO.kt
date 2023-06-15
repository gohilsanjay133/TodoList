package com.todo.list.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.todo.list.data.db.model.TodoListData

@Dao
interface TodoListDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(todoListData: TodoListData)

    @Query("SELECT * FROM TODOLIST")
    suspend fun getTodoList(): List<TodoListData>

    @Delete
    suspend fun deleteTodoItem(todoListData: TodoListData)

}