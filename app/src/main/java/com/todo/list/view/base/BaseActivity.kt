package com.todo.list.view.base

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewbinding.ViewBinding
import com.google.android.material.snackbar.Snackbar
import com.todo.list.databinding.LayoutToolbarBinding
import com.todo.list.interfaces.MoreOptionItemClickListener


abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    val binding: VB by lazy {
        setBinding(layoutInflater)
    }
    val mTAG: String = BaseActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mInitBasicView()
    }

    protected abstract fun setBinding(layoutInflater: LayoutInflater): VB

    private fun mInitBasicView() {
        supportActionBar?.hide()
        initView()
    }

    abstract fun initView()

    protected open fun startNewActivityWithFinishPreviewsOne(destinationClass: Class<*>?) {
        startActivity(
            Intent(this, destinationClass).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        )
        finish()
    }


    protected open fun startNewActivity(destinationClass: Class<*>?) {
        val intent = Intent(this@BaseActivity, destinationClass)
        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
    }

    protected open fun manageError(mErrorMessage: String, view: View): Boolean {
        messageSnackBar(mErrorMessage, view)
        return false
    }


    protected open fun isEditTextEmpty(editText: EditText?): Boolean {
        return editText == null || editText.text.toString().isEmpty()
    }

    protected open fun isTextViewEmpty(textView: TextView?): Boolean {
        return textView == null || textView.text.toString().isEmpty()
    }

    protected fun messageSnackBar(message: String, view: View) {
        Snackbar.make(this@BaseActivity, view, message, Snackbar.LENGTH_SHORT).show()
    }


    fun mManageToolbar(
        binding: LayoutToolbarBinding,
        title: String,
        isShowMoreButton: Boolean,
        moreOptionIcon: Int,
        moreOptionItemClickListener: MoreOptionItemClickListener?
    ) {
        binding.tvTitle.text = title
        binding.imgBack.setOnClickListener {
            finish()
        }
        if (isShowMoreButton) {
            binding.imgMoreOption.visibility = View.VISIBLE
            binding.imgMoreOption.setImageDrawable(
                ContextCompat.getDrawable(
                    this@BaseActivity,
                    moreOptionIcon
                )
            )
            binding.imgMoreOption.setOnClickListener {
                moreOptionItemClickListener?.onClick()
            }
        } else
            binding.imgMoreOption.visibility = View.GONE
    }

}