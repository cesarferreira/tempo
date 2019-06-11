package com.cesarferreira.tempo

import org.amshove.kluent.`should be equal to`
import org.junit.Test
import java.util.Date

class TempoTest {

    @Test
    fun `playground test`() {

        println(Tempo.today)
        println(Tempo.today.with(minute = 0, hour = 0, second = 0))
        println(Tempo.yesterday)
        println(Tempo.today - 1.year)
        println(Tempo.with(year = 1990, month = 1, day = 21))
        println(15.seconds.value)
        println("2016-06-14".toDate("yyyy-MM-dd"))

        1 `should be equal to` 1
    }

    @Test
    fun `is date 2 hours in the future?`() {
        val date = Tempo.today + 2.hours
        val future = Date().addHours(2)
        assertEquals(expected = date, actual = future)
    }
}
