package com.apps.sms.ui.calendar

import android.view.View
import android.widget.TextView
import com.apps.sms.R
import com.apps.sms.databinding.CalendarDayLayoutBinding
import com.kizitonwose.calendar.view.CalendarView

import com.kizitonwose.calendar.view.ViewContainer

class DayViewContainer(view: View) : ViewContainer(view) {
    var date = CalendarDayLayoutBinding.bind(view).calendarDayText

}
