package com.todo.list.data.db.datasource

import com.todo.list.data.db.model.TodoListData

interface TodoListDataSource {

    suspend fun mSaveTodoList(todoListData: TodoListData)

    suspend fun mGetTodoList(): List<TodoListData>
}