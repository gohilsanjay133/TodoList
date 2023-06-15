package com.todo.list.usecasae

import com.todo.list.data.db.model.TodoListData
import com.todo.list.repository.MainRepository

class TodoListUseCase(private val mainRepository: MainRepository) {

    suspend fun mSaveTodoList(todoListData: TodoListData) {
        mainRepository.mSaveTodoList(todoListData)
    }

    suspend fun mGetAllTodoList() = mainRepository.mGetAllTodoList()

    suspend fun deleteTodoItem(todoListData: TodoListData) {
        mainRepository.deleteTodoItem(todoListData)
    }
}