package com.todo.list.view.todolist

import androidx.lifecycle.ViewModel
import com.todo.list.data.db.model.TodoListData
import com.todo.list.usecasae.TodoListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val todoListUseCase: TodoListUseCase
) :
    ViewModel() {

    suspend fun mGetTodoList() = todoListUseCase.mGetAllTodoList()

    suspend fun mSaveTodoList(todoListData: TodoListData) {
        todoListUseCase.mSaveTodoList(todoListData)
    }

    suspend fun mDeleteTodoItem(todoListData: TodoListData) {
        todoListUseCase.deleteTodoItem(todoListData)
    }
}