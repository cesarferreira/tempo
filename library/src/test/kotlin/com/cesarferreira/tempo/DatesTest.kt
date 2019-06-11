package com.cesarferreira.tempo

import org.junit.Test
import java.util.Calendar
import java.util.Date

/**
 * Unit test for [Dates].
 */
class DatesTest {

    @Test
    fun now() {
        assertEquals(expected = Date(), actual = Dates.today)
    }

    @Test
    fun today() {
        assertEquals(expected = Date(), actual = Dates.today)
    }

    @Test
    fun tomorrow() {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_MONTH, 1)
        assertEquals(expected = calendar.time, actual = Dates.tomorrow)
    }

    @Test
    fun yesterday() {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_MONTH, -1)
        assertEquals(expected = calendar.time, actual = Dates.yesterday)
    }

    @Test
    fun dateYear() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.YEAR, 1990)
        assertEquals(expected = calendar.time, actual = Dates.with(year = 1990))
    }

    @Test
    fun dateMonth() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.MONTH, 0)
        assertEquals(expected = calendar.time, actual = Dates.with(month = 1))
    }

    @Test
    fun dateDay() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.DATE, 21)
        assertEquals(expected = calendar.time, actual = Dates.with(day = 21))
    }

    @Test
    fun dateHour() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, 4)
        assertEquals(expected = calendar.time, actual = Dates.with(hour = 4))
    }

    @Test
    fun dateMinute() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.MINUTE, 30)
        assertEquals(expected = calendar.time, actual = Dates.with(minute = 30))
    }

    @Test
    fun dateSecond() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.SECOND, 10)
        assertEquals(expected = calendar.time, actual = Dates.with(second = 10))
    }
}