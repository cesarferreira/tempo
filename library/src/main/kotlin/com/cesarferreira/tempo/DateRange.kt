package com.cesarferreira.tempo

import java.util.Date

/**
 * A range of values of type [Date].
 */
class DateRange(
    override val start: Date,
    override val endInclusive: Date
) : ClosedRange<Date> {
    override fun contains(value: Date) = start < value && value < endInclusive
}