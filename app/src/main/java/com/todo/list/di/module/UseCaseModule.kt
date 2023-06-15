package com.todo.list.di.module

import com.todo.list.repository.MainRepository
import com.todo.list.usecasae.TodoListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideTodoListUseCase(
        mainRepository: MainRepository
    ): TodoListUseCase {
        return TodoListUseCase(mainRepository)
    }

}