package com.todo.list.view.todolist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.todo.list.usecasae.TodoListUseCase

class TodoListViewModelFactory(
    private val todoListUseCase: TodoListUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TodoListViewModel(
            todoListUseCase
        ) as T
    }
}