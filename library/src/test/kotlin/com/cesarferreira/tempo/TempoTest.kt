package com.cesarferreira.tempo

import org.amshove.kluent.`should be equal to`
import org.junit.Test
import java.util.Date

class TempoTest {

    @Test
    fun `playground test`() {

        println(Tempo.today)
        println(Tempo.yesterday)
        println(Tempo.today - 1.year)
        println(Tempo.with(year = 1990, month = 1, day = 21))

        1 `should be equal to` 1
    }

    @Test
    fun `is date 2 hours in the future?`() {
        val date = Tempo.today + 2.hours
        val future = Date().addHours(2)
        assertEquals(expected = date, actual = future)
    }
}
