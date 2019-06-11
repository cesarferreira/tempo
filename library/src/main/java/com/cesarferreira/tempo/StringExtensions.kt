package com.cesarferreira.tempo

import java.text.SimpleDateFormat
import java.util.Date

fun String.toDate(format: String): Date = SimpleDateFormat(format).parse(this)
