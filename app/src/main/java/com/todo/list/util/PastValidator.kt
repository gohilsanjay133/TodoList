package com.todo.list.util

import android.os.Parcel
import android.os.Parcelable
import com.google.android.material.datepicker.CalendarConstraints

class PastValidator(private val minDate: Long) : CalendarConstraints.DateValidator {

    override fun isValid(date: Long): Boolean {
        return date >= minDate
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {}

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<PastValidator> =
            object : Parcelable.Creator<PastValidator> {
                override fun createFromParcel(source: Parcel): PastValidator {
                    return PastValidator(source.readLong())
                }

                override fun newArray(size: Int): Array<PastValidator?> {
                    return arrayOfNulls(size)
                }
            }
    }
}