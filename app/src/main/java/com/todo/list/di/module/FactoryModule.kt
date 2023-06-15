package com.todo.list.di.module

import com.todo.list.usecasae.TodoListUseCase
import com.todo.list.view.todolist.TodoListViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideMainViewModelFactory(
        todoListUseCase: TodoListUseCase
    ): TodoListViewModelFactory {
        return TodoListViewModelFactory(
            todoListUseCase
        )
    }

}