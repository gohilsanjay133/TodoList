package com.todo.list.view.todolist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/todo/list/view/todolist/TodoListViewModel;", "Landroidx/lifecycle/ViewModel;", "todoListUseCase", "Lcom/todo/list/usecasae/TodoListUseCase;", "(Lcom/todo/list/usecasae/TodoListUseCase;)V", "mDeleteTodoItem", "", "todoListData", "Lcom/todo/list/data/db/model/TodoListData;", "(Lcom/todo/list/data/db/model/TodoListData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mGetTodoList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mSaveTodoList", "app_debug"})
public final class TodoListViewModel extends androidx.lifecycle.ViewModel {
    private final com.todo.list.usecasae.TodoListUseCase todoListUseCase = null;
    
    @javax.inject.Inject
    public TodoListViewModel(@org.jetbrains.annotations.NotNull
    com.todo.list.usecasae.TodoListUseCase todoListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object mGetTodoList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.todo.list.data.db.model.TodoListData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object mSaveTodoList(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object mDeleteTodoItem(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}