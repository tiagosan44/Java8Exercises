package com.myProjects.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void main(String[] args) {
        parseLocalDate();
    }
    
    public static void parseLocalDate() {
        String date = "2018-04-28";
        LocalDate localDate = LocalDate.parse(date);
        LocalDate parse = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse);

        String date1 = "20180428";
        LocalDate parse1 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        String date2 = "2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate parse2 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println(parse2);
    }

    public static void formatLocalDate() {

    }
}
