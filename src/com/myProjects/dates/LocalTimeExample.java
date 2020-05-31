package com.myProjects.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(LocalTime.of(4,32, 57));

        //getting values from local time

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(now.toSecondOfDay());

        //Modify values of localtime

        System.out.println(now.minusHours(2));
        System.out.println(now.minus(2, ChronoUnit.SECONDS));
        System.out.println(now.with(LocalTime.MIDNIGHT));
        System.out.println(now.with(ChronoField.HOUR_OF_DAY, 22));
        System.out.println(now.withHour(10));
    }
}
