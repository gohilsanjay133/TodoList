package com.todo.list.view.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/todo/list/view/todolist/TodoListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/todo/list/view/todolist/TodoListViewHolder;", "mTodoList", "", "Lcom/todo/list/data/db/model/TodoListData;", "deleteAndTaskCompletionTodoItemClickListener", "Lcom/todo/list/interfaces/DeleteAndTaskCompletionTodoItemClickListener;", "(Ljava/util/List;Lcom/todo/list/interfaces/DeleteAndTaskCompletionTodoItemClickListener;)V", "getItemCount", "", "mUpdateList", "", "mNewBatList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class TodoListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.todo.list.view.todolist.TodoListViewHolder> {
    private final java.util.List<com.todo.list.data.db.model.TodoListData> mTodoList = null;
    private final com.todo.list.interfaces.DeleteAndTaskCompletionTodoItemClickListener deleteAndTaskCompletionTodoItemClickListener = null;
    
    public TodoListAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.todo.list.data.db.model.TodoListData> mTodoList, @org.jetbrains.annotations.NotNull
    com.todo.list.interfaces.DeleteAndTaskCompletionTodoItemClickListener deleteAndTaskCompletionTodoItemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.todo.list.view.todolist.TodoListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.todo.list.view.todolist.TodoListViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void mUpdateList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.todo.list.data.db.model.TodoListData> mNewBatList) {
    }
}