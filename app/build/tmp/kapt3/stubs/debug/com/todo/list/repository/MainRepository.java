package com.todo.list.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/todo/list/repository/MainRepository;", "", "deleteTodoItem", "", "todoListData", "Lcom/todo/list/data/db/model/TodoListData;", "(Lcom/todo/list/data/db/model/TodoListData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mGetAllTodoList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mSaveTodoList", "app_debug"})
public abstract interface MainRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object mSaveTodoList(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object mGetAllTodoList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.todo.list.data.db.model.TodoListData>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}