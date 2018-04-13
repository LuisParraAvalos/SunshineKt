package com.luisparra.sunshine.data.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.luisparra.sunshine.R
import com.luisparra.sunshine.commons.adapter.ViewDelegateAdapter
import com.luisparra.sunshine.commons.adapter.ViewType
import com.luisparra.sunshine.commons.inflate

//Created by luisparra on 13/04/18.
class AdDelegateAdapter : ViewDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder  =
            AdViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }
}

class AdViewHolder(parent: ViewGroup) :
        RecyclerView.ViewHolder(parent.inflate(R.layout.list_item_forecast))
