package com.xingyu.mvvmsample.view.adapter

import android.databinding.BindingAdapter
import android.view.View

class CustomBindingAdapter {
    companion object {
        @JvmStatic
        @BindingAdapter("visibleGone")
        fun showHide(view: View, show: Boolean) {
            view.visibility = if (show) View.VISIBLE else View.GONE
        }
    }
}