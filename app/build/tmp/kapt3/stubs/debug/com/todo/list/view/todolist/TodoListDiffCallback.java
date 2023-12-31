package com.todo.list.view.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0017J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/todo/list/view/todolist/TodoListDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/todo/list/data/db/model/TodoListData;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldPosition", "", "newPosition", "areItemsTheSame", "oldItemPosition", "newItemPosition", "getChangePayload", "", "getNewListSize", "getOldListSize", "app_debug"})
public final class TodoListDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
    private final java.util.List<com.todo.list.data.db.model.TodoListData> oldList = null;
    private final java.util.List<com.todo.list.data.db.model.TodoListData> newList = null;
    
    public TodoListDiffCallback(@org.jetbrains.annotations.NotNull
    java.util.List<com.todo.list.data.db.model.TodoListData> oldList, @org.jetbrains.annotations.NotNull
    java.util.List<com.todo.list.data.db.model.TodoListData> newList) {
        super();
    }
    
    @java.lang.Override
    public int getOldListSize() {
        return 0;
    }
    
    @java.lang.Override
    public int getNewListSize() {
        return 0;
    }
    
    @java.lang.Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @java.lang.Override
    public boolean areContentsTheSame(int oldPosition, int newPosition) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    @java.lang.Override
    public java.lang.Object getChangePayload(int oldPosition, int newPosition) {
        return null;
    }
}