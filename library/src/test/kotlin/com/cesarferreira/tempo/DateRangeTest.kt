package com.cesarferreira.tempo

import org.junit.Assert
import org.junit.Test

/**
 * Unit test for [DateRange].
 */
class DateRangeTest {

    @Test
    fun range() {
        Assert.assertTrue(1.day.ago in 2.days.ago..Tempo.now)
        Assert.assertTrue(3.days.ago !in 2.days.ago..Tempo.now)
        Assert.assertTrue(Tempo.now in 2.day.ago..2.days.forward)
    }
}