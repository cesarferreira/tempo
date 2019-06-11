package com.cesarferreira.tempo

import java.util.Calendar

val Int.year: TimeInterval
    get() = TimeInterval(unit = Calendar.YEAR, value = this)

val Int.years: TimeInterval
    get() = year

val Int.month: TimeInterval
    get() = TimeInterval(unit = Calendar.MONTH, value = this - 1)

val Int.months: TimeInterval
    get() = month

val Int.week: TimeInterval
    get() = TimeInterval(unit = Calendar.WEEK_OF_MONTH, value = this)

val Int.weeks: TimeInterval
    get() = week

val Int.day: TimeInterval
    get() = TimeInterval(unit = Calendar.DATE, value = this)

val Int.days: TimeInterval
    get() = day

val Int.hour: TimeInterval
    get() = TimeInterval(unit = Calendar.HOUR_OF_DAY, value = this)

val Int.hours: TimeInterval
    get() = hour

val Int.minute: TimeInterval
    get() = TimeInterval(unit = Calendar.MINUTE, value = this)

val Int.minutes: TimeInterval
    get() = minute

val Int.second: TimeInterval
    get() = TimeInterval(unit = Calendar.SECOND, value = this)

val Int.seconds: TimeInterval
    get() = second
