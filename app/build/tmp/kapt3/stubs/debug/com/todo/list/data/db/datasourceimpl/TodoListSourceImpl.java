package com.todo.list.data.db.datasourceimpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/todo/list/data/db/datasourceimpl/TodoListSourceImpl;", "Lcom/todo/list/repository/MainRepository;", "todoListDAO", "Lcom/todo/list/data/db/dao/TodoListDAO;", "(Lcom/todo/list/data/db/dao/TodoListDAO;)V", "deleteTodoItem", "", "todoListData", "Lcom/todo/list/data/db/model/TodoListData;", "(Lcom/todo/list/data/db/model/TodoListData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mGetAllTodoList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mSaveTodoList", "app_debug"})
public final class TodoListSourceImpl implements com.todo.list.repository.MainRepository {
    private final com.todo.list.data.db.dao.TodoListDAO todoListDAO = null;
    
    public TodoListSourceImpl(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.dao.TodoListDAO todoListDAO) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object mSaveTodoList(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object mGetAllTodoList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.todo.list.data.db.model.TodoListData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}