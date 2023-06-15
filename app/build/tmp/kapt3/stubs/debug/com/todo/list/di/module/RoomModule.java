package com.todo.list.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/todo/list/di/module/RoomModule;", "", "()V", "providerTodoListDataSource", "Lcom/todo/list/repository/MainRepository;", "todoListDAO", "Lcom/todo/list/data/db/dao/TodoListDAO;", "app_debug"})
@dagger.Module
public final class RoomModule {
    
    public RoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.todo.list.repository.MainRepository providerTodoListDataSource(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.dao.TodoListDAO todoListDAO) {
        return null;
    }
}