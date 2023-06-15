package com.todo.list.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/todo/list/dialog/DeleteTodoConfirmationDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "todoName", "", "deleteConfirmationDialogListener", "Lcom/todo/list/interfaces/DeleteConfirmationDialogListener;", "(Landroid/content/Context;Ljava/lang/String;Lcom/todo/list/interfaces/DeleteConfirmationDialogListener;)V", "mSetUpListener", "", "binding", "Lcom/todo/list/databinding/DialogDeleteTodoConfirmationBinding;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class DeleteTodoConfirmationDialog extends android.app.Dialog {
    private final java.lang.String todoName = null;
    private final com.todo.list.interfaces.DeleteConfirmationDialogListener deleteConfirmationDialogListener = null;
    
    public DeleteTodoConfirmationDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String todoName, @org.jetbrains.annotations.NotNull
    com.todo.list.interfaces.DeleteConfirmationDialogListener deleteConfirmationDialogListener) {
        super(null);
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void mSetUpListener(com.todo.list.databinding.DialogDeleteTodoConfirmationBinding binding) {
    }
}