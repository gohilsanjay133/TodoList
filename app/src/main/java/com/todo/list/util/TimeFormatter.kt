package com.todo.list.util

import java.text.SimpleDateFormat
import java.util.*

class TimeFormatter {

    companion object {
        var TODO_DATE_FORMAT = SimpleDateFormat("dd MMM yyyy hh:mm a", Locale.getDefault())
        var DISPLAY_DATE_FORMAT = SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.getDefault())
    }
}