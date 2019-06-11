package com.cesarferreira.tempo

import java.util.Calendar
import java.util.Date

fun Long.addMinutes(minutes: Int) = manipulateTime(this, minutes, Calendar.MINUTE, isPast = false)
fun Long.removeMinutes(minutes: Int): Long = manipulateTime(this, minutes, Calendar.MINUTE, isPast = true)

fun Date.addMinutes(minutes: Int) = this.time.addMinutes(minutes)
fun Date.removeMinutes(minutes: Int) = this.time.removeMinutes(minutes)

fun Long.addHours(hours: Int): Long = manipulateTime(this, hours, Calendar.HOUR, isPast = false)
fun Long.removeHours(hours: Int): Long = manipulateTime(this, hours, Calendar.HOUR, isPast = true)

fun Date.addHours(hours: Int) = this.time.addHours(hours)
fun Date.removeHours(hours: Int) = this.time.addHours(hours)

private fun manipulateTime(currentTime: Long, amount: Int, calendarField: Int, isPast: Boolean): Long {
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = currentTime
    calendar.add(calendarField, amount * if (isPast) -1 else 1)
    return calendar.timeInMillis
}

// is tomorrow
// is yesterday

fun Date.isToday(): Boolean = isDateIn(this, 0)
fun Date.isYesterday(): Boolean = isDateIn(this, -1)
fun Date.isTomorrow(): Boolean = isDateIn(this, 1)

private fun isDateIn(date: Date, variable: Int = 0): Boolean {
    val now = Calendar.getInstance()
    val cdate = Calendar.getInstance()
    cdate.timeInMillis = date.time

    now.add(Calendar.DATE, variable)

    return (now.get(Calendar.YEAR) == cdate.get(Calendar.YEAR)
        && now.get(Calendar.MONTH) == cdate.get(Calendar.MONTH)
        && now.get(Calendar.DATE) == cdate.get(Calendar.DATE))
}