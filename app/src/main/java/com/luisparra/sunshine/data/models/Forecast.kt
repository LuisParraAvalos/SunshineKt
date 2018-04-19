package com.luisparra.sunshine.data.models

import com.luisparra.sunshine.commons.adapter.AdapterConstants
import com.luisparra.sunshine.commons.adapter.ViewType

//Created by luisparra on 17/04/18.
data class Forecast(var min: Int = 0, var max: Int = 0, var description: String) : ViewType {
    override fun getViewType(): Int = AdapterConstants.FORECAST
}