package com.myProjects.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormattingLocalTimeExample {

    public static  void parseTime() {
        String time = "13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println(localTime);
        LocalTime parse = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(parse);

        //Custom format
        String time1 = "13*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime parse1 = LocalTime.parse(time1, dateTimeFormatter);
        System.out.println(parse1);
    }

    public static void formatTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime = LocalTime.now();
        String format = localTime.format(dateTimeFormatter);
        System.out.println(format);
    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
