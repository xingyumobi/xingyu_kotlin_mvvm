package com.xingyu.mvvmsample.view.callback

import android.view.View
import com.xingyu.mvvmsample.service.model.Project



interface ProjectClickCallback {
    fun onClick(view: View, project: Project)
}