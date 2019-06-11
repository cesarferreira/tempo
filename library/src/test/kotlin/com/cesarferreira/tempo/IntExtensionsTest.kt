package com.cesarferreira.tempo

import org.junit.Test
import java.util.Calendar

/**
 * Unit test for IntExtensions.
 */
class IntExtensionsTest {

    @Test
    fun year() {
        assertEquals(expected = TimeInterval(unit = Calendar.YEAR, value = 1), actual = 1.year)
    }

    @Test
    fun years() {
        assertEquals(expected = TimeInterval(unit = Calendar.YEAR, value = 5), actual = 5.years)
    }

    @Test
    fun month() {
        assertEquals(expected = TimeInterval(unit = Calendar.MONTH, value = 0), actual = 1.month)
    }

    @Test
    fun months() {
        assertEquals(expected = TimeInterval(unit = Calendar.MONTH, value = 2), actual = 3.months)
    }

    @Test
    fun week() {
        assertEquals(expected = TimeInterval(unit = Calendar.WEEK_OF_MONTH, value = 1), actual = 1.week)
    }

    @Test
    fun weeks() {
        assertEquals(expected = TimeInterval(unit = Calendar.WEEK_OF_MONTH, value = 7), actual = 7.weeks)
    }

    @Test
    fun day() {
        assertEquals(expected = TimeInterval(unit = Calendar.DAY_OF_MONTH, value = 1), actual = 1.day)
    }

    @Test
    fun days() {
        assertEquals(expected = TimeInterval(unit = Calendar.DAY_OF_MONTH, value = 9), actual = 9.days)
    }

    @Test
    fun hour() {
        assertEquals(expected = TimeInterval(unit = Calendar.HOUR_OF_DAY, value = 1), actual = 1.hour)
    }

    @Test
    fun hours() {
        assertEquals(expected = TimeInterval(unit = Calendar.HOUR_OF_DAY, value = 11), actual = 11.hours)
    }

    @Test
    fun minute() {
        assertEquals(expected = TimeInterval(unit = Calendar.MINUTE, value = 1), actual = 1.minute)
    }

    @Test
    fun minutes() {
        assertEquals(expected = TimeInterval(unit = Calendar.MINUTE, value = 13), actual = 13.minutes)
    }

    @Test
    fun second() {
        assertEquals(expected = TimeInterval(unit = Calendar.SECOND, value = 1), actual = 1.second)
    }

    @Test
    fun seconds() {
        assertEquals(expected = TimeInterval(unit = Calendar.SECOND, value = 15), actual = 15.seconds)
    }
}