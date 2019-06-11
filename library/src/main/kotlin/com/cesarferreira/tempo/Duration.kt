package com.cesarferreira.tempo

import java.util.Date
import java.util.Objects

class Duration(internal val unit: Int, internal val value: Int) {
    val ago = calculate(from = Date(), value = -value)

    val since = calculate(from = Date(), value = value)

    private fun calculate(from: Date, value: Int): Date {
        com.cesarferreira.tempo.calendar.time = from
        com.cesarferreira.tempo.calendar.add(unit, value)
        return com.cesarferreira.tempo.calendar.time
    }

    override fun hashCode() = Objects.hashCode(unit) * Objects.hashCode(value)

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Duration) {
            return false
        }
        return unit == other.unit && value == other.value
    }
}