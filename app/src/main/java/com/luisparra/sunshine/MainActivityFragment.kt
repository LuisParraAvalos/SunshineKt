package com.luisparra.sunshine


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luisparra.sunshine.data.adapters.ForecastViewAdapter
import com.luisparra.sunshine.data.models.Forecast
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState == null) {
            val weekForecast = mutableListOf(
                    Forecast(description = "Mon 6/23 - Sunny - 31/17"),
                    Forecast(description = "Tue 6/24 - Foggy - 21/8"),
                    Forecast(description = "Wed 6/25 - Cloudy - 22/17"),
                    Forecast(description = "Thurs 6/26 - Rainy - 18/11"),
                    Forecast(description = "Fri 6/27 - Foggy - 21/10"),
                    Forecast(description = "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18"),
                    Forecast(description = "Sun 6/29 - Sunny - 20/7")
            )
            recycler_forecast?.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(context)
                adapter = ForecastViewAdapter()
            }
            (recycler_forecast.adapter as ForecastViewAdapter).addForecast(weekForecast)
        }
    }
}
