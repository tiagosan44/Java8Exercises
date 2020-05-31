package com.myProjects.dates;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.plusWeeks(3);
        Period period = now.until(localDate);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(Period.ofYears(3).toTotalMonths());
    }
}
