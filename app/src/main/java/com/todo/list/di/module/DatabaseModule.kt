package com.todo.list.di.module


import android.app.Application
import androidx.room.Room
import com.todo.list.data.db.TodoListDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Provides
    @Singleton
    fun provideRepositoryModule(
        application: Application
    ) = Room.databaseBuilder(application, TodoListDatabase::class.java, "todo_db")
        .build()

    @Provides
    @Singleton
    fun provideTodoListDAO(todoListDatabase: TodoListDatabase) = todoListDatabase.getTodoListDAO()
}