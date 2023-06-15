package com.todo.list.data.db.datasourceimpl

import com.todo.list.data.db.dao.TodoListDAO
import com.todo.list.data.db.model.TodoListData
import com.todo.list.repository.MainRepository

class TodoListSourceImpl(
    private val todoListDAO: TodoListDAO
) : MainRepository {


    override suspend fun mSaveTodoList(todoListData: TodoListData) {
        todoListDAO.insert(todoListData)
    }

    override suspend fun mGetAllTodoList(): List<TodoListData> {
        return todoListDAO.getTodoList()
    }

    override suspend fun deleteTodoItem(todoListData: TodoListData) {
        todoListDAO.deleteTodoItem(todoListData)
    }


}