package com.myProjects.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(LocalDate.of(2020, 6, 27));
        System.out.println(LocalDate.ofYearDay(2020, 200));

        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));

        //Modifying local date

        System.out.println(now.plusDays(2));
        System.out.println(now.plusMonths(2));
        System.out.println(now.minusDays(16));
        System.out.println(now.withYear(2022));
        System.out.println(now.with(ChronoField.DAY_OF_WEEK, 5));
        System.out.println(now.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(now.minus(1, ChronoUnit.ERAS));


        //Additional features
        System.out.println(now.isLeapYear());
        System.out.println(now.isEqual(now.plusDays(1)));
        System.out.println(now.isBefore(now.minusDays(1)));
        System.out.println(now.isAfter(now.plusDays(1)));

        //Unsupported

        System.out.println(now.isSupported(ChronoUnit.MINUTES));
        System.out.println(now.plus(1, ChronoUnit.MINUTES));
    }
}
