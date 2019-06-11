package com.cesarferreira.tempo

import java.util.Calendar
import java.util.Date

class Tempo {

    companion object {
        fun Date.with(
            year: Int = -1,
            month: Int = -1,
            day: Int = -1,
            hour: Int = -1,
            minute: Int = -1,
            second: Int = -1,
            millisecond: Int = -1
        ): Date {
            calendar.time = this
            if (year > -1) calendar.set(Calendar.YEAR, year)
            if (month > 0) calendar.set(Calendar.MONTH, month - 1)
            if (day > 0) calendar.set(Calendar.DATE, day)
            if (hour > -1) calendar.set(Calendar.HOUR_OF_DAY, hour)
            if (minute > -1) calendar.set(Calendar.MINUTE, minute)
            if (second > -1) calendar.set(Calendar.SECOND, second)
            if (millisecond > -1) calendar.set(Calendar.MILLISECOND, millisecond)
            return calendar.time
        }

        val calendar: Calendar by lazy { Calendar.getInstance() }

        fun today(): Date {
            val now = Date()
            return now.with(year = now.year, month = now.month, day = now.day)
        }

        fun yesterday() {
        }

        fun tomorrow() {
        }
    }
}