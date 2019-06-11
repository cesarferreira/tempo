# tempo

[![Build Status](https://travis-ci.org/cesarferreira/tempo.svg?branch=master)](https://travis-ci.org/cesarferreira/tempo) [![Download](https://api.bintray.com/packages/cesarferreira/maven/tempo/images/download.svg) ](https://bintray.com/cesarferreira/maven/tempo/_latestVersion) [![License](https://img.shields.io/badge/license-APACHE2-green.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

Kotlin intuitive Date extensions.

## Usage

### Add durations to date

```kotlin
val today = Tempo.today
val nextWeek = today + 1.week
val dayBeforeYesterday = today - 2.days

// shortcuts #1
val tomorrow = Tempo.tomorrow
val yesterday = Tempo.yesterday

// shortcuts #2
val yesterday = 1.days.ago
val fiveYearsInTheFuture = 5.years.forward
```

### Initialize by specifying date components

```kotlin
val birthday = Tempo.with(year = 1990, month = 1, day = 21)
val firstCommitDate = Tempo.with(year = 2019, month = 6, day = 26, hour = 18, minute = 58, second = 31, millisecond = 777)
```

### Initialize by changing date components

```kotlin
val today = Tempo.today
val christmas = today.with(month = 12, day = 25)
val thisSunday = today.with(weekday = 1)

// shortcuts
val newYearDay = today.beginningOfYear
val newYearsEve = today.endOfYear
```

### Check day of the week / properties

```kotlin
Tempo.today.isMonday
Tempo.today.isTuesday
Tempo.today.isWednesday
Tempo.today.isThursday
Tempo.today.isFriday
Tempo.today.isSaturday
Tempo.today.isSunday

Tempo.today.isToday                   // true
Tempo.tomorrow.isToday                // false
Tempo.tomorrow.isTomorrow             // true
Tempo.yesterday.isYesterday           // true
```

### Format and parse

```kotlin
5.minutes.forward.toString("yyyy-MM-dd HH:mm:SS")
//=> "2019-06-11 12:05:00"

"1987-06-02".toDate("yyyy-MM-dd")
//=> Tempo.with(year = 1987, month = 6, day = 2)
```

### Compare dates

```kotlin
1.day.ago > 2.days.ago                  // true
1.day.ago in 2.days.ago..Tempo.today    // true
```

## Install

Latest version = [![Download](https://api.bintray.com/packages/cesarferreira/maven/tempo/images/download.svg) ](https://bintray.com/cesarferreira/maven/tempo/_latestVersion)

```groovy
dependencies {
  implementation 'com.github.cesarferreira:tempo:+'
}
```

## Notice

- tempo is inspired by [naoty/Timepiece(Swift)](https://github.com/naoty/Timepiece) and the now unmaintained [hotchemi/khronos](https://github.com/hotchemi/khronos).

## Licence

```
Copyright 2019 Cesar Ferreira

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```