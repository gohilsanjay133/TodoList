package com.todo.list.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import com.todo.list.R
import com.todo.list.databinding.DialogDeleteTodoConfirmationBinding
import com.todo.list.interfaces.DeleteConfirmationDialogListener


class DeleteTodoConfirmationDialog(
    context: Context,
    private val todoName: String,
    private val deleteConfirmationDialogListener: DeleteConfirmationDialogListener
) : Dialog(context) {

    init {
        setCancelable(false)
        setCanceledOnTouchOutside(false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        val dialogConfirmationBinding = DialogDeleteTodoConfirmationBinding.inflate(layoutInflater)
        val wlp = window!!.attributes
        wlp.gravity = Gravity.CENTER
        wlp.flags = wlp.flags and WindowManager.LayoutParams.FLAG_DIM_BEHIND.inv()
        window!!.attributes = wlp
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setContentView(dialogConfirmationBinding.root)
        window!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        val paddingInPixels = context.resources.getDimensionPixelSize(com.intuit.sdp.R.dimen._15sdp)
        window!!.decorView.setPadding(paddingInPixels, paddingInPixels, paddingInPixels, paddingInPixels)
        dialogConfirmationBinding.tvWarningDescription.text =
            context.getString(R.string.do_you_want_to_delete) + " \"" + todoName + "\", " + context.getString(
                R.string.this_action_cant_be_undone
            )
        mSetUpListener(dialogConfirmationBinding)

    }

    private fun mSetUpListener(binding: DialogDeleteTodoConfirmationBinding) {
        binding.tvOk.setOnClickListener {
            deleteConfirmationDialogListener.onClick()
            dismiss()
        }
        binding.tvCancel.setOnClickListener {
            dismiss()
        }
    }
}