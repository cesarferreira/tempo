package com.cesarferreira.tempo

import org.junit.Assert
import org.junit.Test

/**
 * Unit test for [DateRange].
 */
class DateRangeTest {

    @Test
    fun range() {
        Assert.assertTrue(1.day.ago in 2.days.ago..Tempo.today)
        Assert.assertTrue(3.days.ago !in 2.days.ago..Tempo.today)
        Assert.assertTrue(Tempo.today in 2.day.ago..2.days.forward)
    }
}