package com.todo.list.util

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar

class Utility {

    companion object {
        fun isNotNullOrEmpty(string: String?): Boolean {
            return string != null && string.isNotEmpty()

        }

        fun hideSoftKeyboard(context: Context, view: View) {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }


        private fun messageToast(
            context: Context, view: View, mMessage: String
        ) {
            Snackbar.make(context, view, mMessage, Snackbar.LENGTH_SHORT).show()
        }
    }

}