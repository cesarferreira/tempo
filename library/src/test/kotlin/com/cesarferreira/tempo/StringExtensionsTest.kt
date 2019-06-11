package com.cesarferreira.tempo

import org.junit.Test

class StringExtensionsTest {

    @Test
    fun toDate() {
        assertEquals(
            expected = Tempo.with(year = 1987, month = 6, day = 2, hour = 0, minute = 0, second = 0),
            actual = "1987-06-02".toDate("yyyy-MM-dd")
        )
    }
}
