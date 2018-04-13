package com.luisparra.sunshine.data.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.luisparra.sunshine.commons.adapter.ViewType

//Created by luisparra on 7/04/18.
class ForecastRecyclerViewAdapter(items: ArrayList<ViewType>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: ArrayList<ViewType>

    init{
        this.items = ArrayList()
        this.items.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}