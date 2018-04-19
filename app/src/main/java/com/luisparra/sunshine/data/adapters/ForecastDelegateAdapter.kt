package com.luisparra.sunshine.data.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.luisparra.sunshine.R
import com.luisparra.sunshine.commons.adapter.ViewDelegateAdapter
import com.luisparra.sunshine.commons.adapter.ViewType
import com.luisparra.sunshine.commons.inflate
import com.luisparra.sunshine.data.models.Forecast
import kotlinx.android.synthetic.main.list_item_forecast.view.*

//Created by luisparra on 13/04/18.
class ForecastDelegateAdapter : ViewDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
            ForecastViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as ForecastViewHolder
        holder.bind(item as Forecast)
    }
}

class ForecastViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        parent.inflate(R.layout.list_item_forecast)) {

    fun bind(item: Forecast) = with(itemView) {
        txt_forecast.text = item.description
    }
}