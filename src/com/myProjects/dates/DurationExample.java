package com.myProjects.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(5, 36);
        LocalTime localTime2 = LocalTime.of(20, 25);

        System.out.println(localTime.until(localTime2, ChronoUnit.MINUTES));
        Duration duration = Duration.between(localTime, localTime2);
        System.out.println(duration.toMinutes());

        System.out.println(Duration.ofHours(3).toMinutes());
        System.out.println(Instant.ofEpochSecond(0));

    }
}
