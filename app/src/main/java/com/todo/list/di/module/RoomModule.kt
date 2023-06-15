package com.todo.list.di.module

import com.todo.list.data.db.dao.TodoListDAO
import com.todo.list.data.db.datasourceimpl.TodoListSourceImpl
import com.todo.list.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Singleton
    @Provides
    fun providerTodoListDataSource(todoListDAO: TodoListDAO): MainRepository {
        return TodoListSourceImpl(todoListDAO)
    }

}