package com.cesarferreira.tempo

import org.amshove.kluent.`should be equal to`
import org.junit.Test

class TempoTest {

    @Test
    fun `some test`() {

        println(Dates.today)
        println(Dates.today - 1.year)
        println(Dates.of(year = 1990, month = 1, day = 21))

        1 `should be equal to` 1
    }
}