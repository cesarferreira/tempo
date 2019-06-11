package com.cesarferreira.tempo

import org.amshove.kluent.`should be equal to`
import org.amshove.kluent.shouldBe
import org.junit.Test

class TempoTest {

    @Test
    fun `some test`() {

        println(Tempo.today)
        println(Tempo.today - 1.day)
        println(Tempo.today - 1.year)
        println(Tempo.with(year = 1990, month = 1, day = 21))

        1 `should be equal to` 1
    }

    @Test
    fun `is date today?`() {
        val date = Tempo.today
        date.isToday() shouldBe true
    }

    @Test
    fun `is date yesterday?`() {
        val date = Tempo.today - 1.day
        date.isYesterday() shouldBe true
    }

    @Test
    fun `is date tomorrow?`() {
        val date = Tempo.tomorrow
        date.isTomorrow() shouldBe true
    }
}
