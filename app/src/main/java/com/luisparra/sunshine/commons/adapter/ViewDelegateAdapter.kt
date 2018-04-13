package com.luisparra.sunshine.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

//Created by luisparra on 7/04/18.
interface ViewDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}