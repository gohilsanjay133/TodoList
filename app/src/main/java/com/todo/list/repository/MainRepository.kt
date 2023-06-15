package com.todo.list.repository

import com.todo.list.data.db.model.TodoListData


interface MainRepository {

    suspend fun mSaveTodoList(todoListData: TodoListData)

    suspend fun mGetAllTodoList(): List<TodoListData>

    suspend fun deleteTodoItem(todoListData: TodoListData)
}