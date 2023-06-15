package com.todo.list.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/todo/list/util/PastValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "minDate", "", "(J)V", "describeContents", "", "isValid", "", "date", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class PastValidator implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {
    private final long minDate = 0L;
    @org.jetbrains.annotations.NotNull
    public static final com.todo.list.util.PastValidator.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public static final android.os.Parcelable.Creator<com.todo.list.util.PastValidator> CREATOR = null;
    
    public PastValidator(long minDate) {
        super();
    }
    
    @java.lang.Override
    public boolean isValid(long date) {
        return false;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/todo/list/util/PastValidator$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/todo/list/util/PastValidator;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}