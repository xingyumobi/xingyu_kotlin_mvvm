package com.xingyu.mvvmsample.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.xingyu.mvvmsample.view.callback.ProjectClickCallback
import android.view.LayoutInflater
import android.databinding.DataBindingUtil
import com.xingyu.mvvmsample.R
import com.xingyu.mvvmsample.service.model.Project
import android.support.v7.util.DiffUtil
import com.xingyu.mvvmsample.databinding.ProjectListItemBinding
import java.util.*


class ProjectAdapter(private val projectList: MutableList<Project> ,private val projectClickCallback: ProjectClickCallback): RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val binding = DataBindingUtil.inflate<ProjectListItemBinding>(LayoutInflater.from(parent.context), R.layout.project_list_item,
                        parent, false)

        binding.callback=projectClickCallback

        return ProjectViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return projectList!!.size
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.binding.project=projectList?.get(position)
        holder.binding.executePendingBindings()
    }

    class ProjectViewHolder(val binding: ProjectListItemBinding) : RecyclerView.ViewHolder(binding.root)
}