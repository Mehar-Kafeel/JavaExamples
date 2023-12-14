package org.vend.javaexamples.java8.datetime;

import java.time.*;

public class Practice {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, Month.DECEMBER, 14);
        ZonedDateTime takeoff = ZonedDateTime.of(date, LocalTime.of(11,19), ZoneId.of("Asia/Tokyo"));
        ZonedDateTime landing = ZonedDateTime.of(date, LocalTime.of(9,19), ZoneId.of("America/New_York"));

        Duration flightTime = Duration.between(takeoff, landing);
        System.out.println("Flight time: " + flightTime);
    }
}
