package com.todo.list.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/todo/list/di/module/DatabaseModule;", "", "()V", "provideRepositoryModule", "Lcom/todo/list/data/db/TodoListDatabase;", "application", "Landroid/app/Application;", "provideTodoListDAO", "Lcom/todo/list/data/db/dao/TodoListDAO;", "todoListDatabase", "app_debug"})
@dagger.Module
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.todo.list.data.db.TodoListDatabase provideRepositoryModule(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.todo.list.data.db.dao.TodoListDAO provideTodoListDAO(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.TodoListDatabase todoListDatabase) {
        return null;
    }
}