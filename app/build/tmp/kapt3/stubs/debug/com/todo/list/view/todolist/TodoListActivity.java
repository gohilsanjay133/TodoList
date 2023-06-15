package com.todo.list.view.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/todo/list/view/todolist/TodoListActivity;", "Lcom/todo/list/view/base/BaseActivity;", "Lcom/todo/list/databinding/ActivityTodoListBinding;", "Lcom/todo/list/interfaces/MoreOptionItemClickListener;", "Lcom/todo/list/interfaces/DeleteAndTaskCompletionTodoItemClickListener;", "()V", "mTodoList", "Ljava/util/ArrayList;", "Lcom/todo/list/data/db/model/TodoListData;", "todoListAdapter", "Lcom/todo/list/view/todolist/TodoListAdapter;", "todoListViewModel", "Lcom/todo/list/view/todolist/TodoListViewModel;", "getTodoListViewModel", "()Lcom/todo/list/view/todolist/TodoListViewModel;", "todoListViewModel$delegate", "Lkotlin/Lazy;", "todoListViewModelFactory", "Lcom/todo/list/view/todolist/TodoListViewModelFactory;", "getTodoListViewModelFactory", "()Lcom/todo/list/view/todolist/TodoListViewModelFactory;", "setTodoListViewModelFactory", "(Lcom/todo/list/view/todolist/TodoListViewModelFactory;)V", "initView", "", "mDeleteTodoItem", "todoListData", "mInitClickEvent", "mInitRecyclerview", "mInitTodoList", "onClick", "onResume", "onTaskCompletion", "setBinding", "layoutInflater", "Landroid/view/LayoutInflater;", "showPopupMenu", "view", "Landroid/view/View;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class TodoListActivity extends com.todo.list.view.base.BaseActivity<com.todo.list.databinding.ActivityTodoListBinding> implements com.todo.list.interfaces.MoreOptionItemClickListener, com.todo.list.interfaces.DeleteAndTaskCompletionTodoItemClickListener {
    @javax.inject.Inject
    public com.todo.list.view.todolist.TodoListViewModelFactory todoListViewModelFactory;
    private final kotlin.Lazy todoListViewModel$delegate = null;
    private com.todo.list.view.todolist.TodoListAdapter todoListAdapter;
    private final java.util.ArrayList<com.todo.list.data.db.model.TodoListData> mTodoList = null;
    
    public TodoListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.todo.list.view.todolist.TodoListViewModelFactory getTodoListViewModelFactory() {
        return null;
    }
    
    public final void setTodoListViewModelFactory(@org.jetbrains.annotations.NotNull
    com.todo.list.view.todolist.TodoListViewModelFactory p0) {
    }
    
    private final com.todo.list.view.todolist.TodoListViewModel getTodoListViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.todo.list.databinding.ActivityTodoListBinding setBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater layoutInflater) {
        return null;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    private final void mInitClickEvent() {
    }
    
    private final void mInitRecyclerview() {
    }
    
    private final void mInitTodoList() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    public void onClick() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData) {
    }
    
    @java.lang.Override
    public void onTaskCompletion(@org.jetbrains.annotations.NotNull
    com.todo.list.data.db.model.TodoListData todoListData) {
    }
    
    private final void mDeleteTodoItem(com.todo.list.data.db.model.TodoListData todoListData) {
    }
    
    private final void showPopupMenu(android.view.View view) {
    }
}