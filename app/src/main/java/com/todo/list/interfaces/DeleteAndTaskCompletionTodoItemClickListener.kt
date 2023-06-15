package com.todo.list.interfaces

import com.todo.list.data.db.model.TodoListData

interface DeleteAndTaskCompletionTodoItemClickListener {
    fun onClick(todoListData: TodoListData)
    fun onTaskCompletion(todoListData: TodoListData)
}