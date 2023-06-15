package com.todo.list.view.addtask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/todo/list/view/addtask/AddTaskActivity;", "Lcom/todo/list/view/base/BaseActivity;", "Lcom/todo/list/databinding/ActivityAddTaskBinding;", "()V", "addTaskViewModel", "Lcom/todo/list/view/todolist/TodoListViewModel;", "getAddTaskViewModel", "()Lcom/todo/list/view/todolist/TodoListViewModel;", "addTaskViewModel$delegate", "Lkotlin/Lazy;", "addTaskViewModelFactory", "Lcom/todo/list/view/todolist/TodoListViewModelFactory;", "getAddTaskViewModelFactory", "()Lcom/todo/list/view/todolist/TodoListViewModelFactory;", "setAddTaskViewModelFactory", "(Lcom/todo/list/view/todolist/TodoListViewModelFactory;)V", "selectedCalendar", "Ljava/util/Calendar;", "createDatePickerConstraints", "Lcom/google/android/material/datepicker/CalendarConstraints;", "currentDate", "", "initView", "", "mInitClickEvent", "mValidateAndSaveTask", "mValidateTodo", "", "setBinding", "layoutInflater", "Landroid/view/LayoutInflater;", "showDateTimePicker", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AddTaskActivity extends com.todo.list.view.base.BaseActivity<com.todo.list.databinding.ActivityAddTaskBinding> {
    @javax.inject.Inject
    public com.todo.list.view.todolist.TodoListViewModelFactory addTaskViewModelFactory;
    private final kotlin.Lazy addTaskViewModel$delegate = null;
    private java.util.Calendar selectedCalendar;
    
    public AddTaskActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.todo.list.view.todolist.TodoListViewModelFactory getAddTaskViewModelFactory() {
        return null;
    }
    
    public final void setAddTaskViewModelFactory(@org.jetbrains.annotations.NotNull
    com.todo.list.view.todolist.TodoListViewModelFactory p0) {
    }
    
    private final com.todo.list.view.todolist.TodoListViewModel getAddTaskViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.todo.list.databinding.ActivityAddTaskBinding setBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater layoutInflater) {
        return null;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    private final void mInitClickEvent() {
    }
    
    private final void showDateTimePicker() {
    }
    
    private final com.google.android.material.datepicker.CalendarConstraints createDatePickerConstraints(long currentDate) {
        return null;
    }
    
    private final boolean mValidateTodo() {
        return false;
    }
    
    private final void mValidateAndSaveTask() {
    }
}