package com.cesarferreira.tempo

import java.util.Calendar
import java.util.Date

/**
 * NOTE: In Kotlin you can't add companion object extensions to existing Java class.
 */
object Dates {
    val today = Date()

    val tomorrow = setDate(value = 1)

    val yesterday = setDate(value = -1)

    private fun setDate(value: Int): Date {
        com.cesarferreira.tempo.calendar.time = Date()
        com.cesarferreira.tempo.calendar.add(Calendar.DATE, value)
        return com.cesarferreira.tempo.calendar.time
    }

    fun of(year: Int = -1, month: Int = -1, day: Int = -1, hour: Int = -1, minute: Int = -1, second: Int = -1): Date {
        com.cesarferreira.tempo.calendar.time = Date()
        if (year > -1) com.cesarferreira.tempo.calendar.set(Calendar.YEAR, year)
        if (month > 0) com.cesarferreira.tempo.calendar.set(Calendar.MONTH, month - 1)
        if (day > 0) com.cesarferreira.tempo.calendar.set(Calendar.DATE, day)
        if (hour > -1) com.cesarferreira.tempo.calendar.set(Calendar.HOUR_OF_DAY, hour)
        if (minute > -1) com.cesarferreira.tempo.calendar.set(Calendar.MINUTE, minute)
        if (second > -1) com.cesarferreira.tempo.calendar.set(Calendar.SECOND, second)
        return com.cesarferreira.tempo.calendar.time
    }
}
