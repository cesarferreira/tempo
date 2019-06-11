package com.cesarferreira.tempo

import java.util.Calendar
import java.util.Date

/**
 * NOTE: In Kotlin you can't add companion object extensions to existing Java class.
 * otherwise we would just use Date.java class
 */
object Tempo {

    val today: Date
        get() = Date()

    val tomorrow: Date
        get() = setDate(value = 1)

    val yesterday: Date
        get() = setDate(value = -1)

    private fun setDate(value: Int): Date {
        calendar.time = Date()
        calendar.add(Calendar.DATE, value)
        return calendar.time
    }

    fun with(
        year: Int = -1,
        month: Int = -1,
        day: Int = -1,
        hour: Int = -1,
        minute: Int = -1,
        second: Int = -1,
        milliseconds: Int = -1
    ): Date {
        return Date().with(year, month, day, hour, minute, second, milliseconds)
    }
}
