package com.cesarferreira.tempo

import org.junit.Assert
import java.util.Date

fun assertEquals(expected: Date, actual: Date) {
    Assert.assertEquals(expected.toString(), actual.toString())
}

fun assertEquals(expected: TimeInterval, actual: TimeInterval) {
    Assert.assertEquals(expected, actual)
}