package com.luisparra.sunshine.data.adapters

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.luisparra.sunshine.commons.adapter.AdapterConstants
import com.luisparra.sunshine.commons.adapter.ViewDelegateAdapter
import com.luisparra.sunshine.commons.adapter.ViewType
import com.luisparra.sunshine.data.models.Forecast

//Created by luisparra on 7/04/18.
class ForecastViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items = mutableListOf<ViewType>()
    private var delegateAdapters = SparseArrayCompat<ViewDelegateAdapter>()

    private val loadingItem = object : ViewType {
        override fun getViewType(): Int = AdapterConstants.LOADING
    }

    init {
        delegateAdapters.put(AdapterConstants.LOADING, LoadingDelegateAdapter())
        delegateAdapters.put(AdapterConstants.FORECAST, ForecastDelegateAdapter())
        this.items = mutableListOf()
        this.items.add(loadingItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            delegateAdapters.get(viewType).onCreateViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
            delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, items[position])

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = items[position].getViewType()

    fun addForecast(weekForecast: MutableList<Forecast>) {
        // first remove loading and notify
        val initPosition = items.size - 1
        items.removeAt(initPosition)
        notifyItemRemoved(initPosition)

        // insert news and the loading at the end of the list
        items.addAll(weekForecast)
        items.add(loadingItem)
        notifyItemRangeChanged(initPosition, items.size + 1 /* plus loading item */)
    }

    fun clearAndAddForecast(news: List<Forecast>) {
        items.clear()
        notifyItemRangeRemoved(0, getLastPosition())

        items.addAll(news)
        items.add(loadingItem)
        notifyItemRangeInserted(0, items.size)
    }

    fun getForecast(): List<Forecast> {
        return items
                .filter { it.getViewType() == AdapterConstants.FORECAST }
                .map { it as Forecast }
    }

    private fun getLastPosition() = if (items.lastIndex == -1) 0 else items.lastIndex
}