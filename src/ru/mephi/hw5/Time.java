package ru.mephi.hw5;

import java.time.*;
import java.time.LocalDateTime.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneOffsetTransitionRule;

import static java.time.temporal.TemporalAdjusters.*;

public class Time {
    public static void main(String... args) {
//        LocalDate now,nextT;
//        now = LocalDate.now();
//        System.out.println(now);
//        nextT = now.with(next(DayOfWeek.TUESDAY));
//        System.out.println(nextT);
        LocalDate lincolnBirth, lincolnDeath;
        lincolnBirth = LocalDate.of(1809, 2, 12);
        lincolnDeath = LocalDate.of(1865, 4, 15);
        long lengthOfLife = lincolnBirth.until(lincolnDeath, ChronoUnit.YEARS);
        System.out.println("How old when he died? - " + lengthOfLife);
        lengthOfLife = lincolnBirth.until(lincolnDeath, ChronoUnit.DAYS);
        System.out.println("How many days did he live? - " + lengthOfLife);

        LocalDate benedictBirth, countDays, temp, now, twentyOne;
        benedictBirth = LocalDate.of(1976, 7, 19);
        System.out.println("Born in a leap year? - " + benedictBirth.isLeapYear());
        countDays = LocalDate.of(1976, 1, 1);
        temp = countDays.plusYears(1);
        System.out.println("How many days in the year he was born? - " + ChronoUnit.DAYS.between(countDays, temp) + " " + countDays.lengthOfYear());
        now = LocalDate.now();
        long decades = now.until(benedictBirth, ChronoUnit.DAYS) / 10;
        System.out.println("How many decades old is he? - " + decades);
        twentyOne = benedictBirth.plusYears(21);
        System.out.println("What was the day of the week on his 21st birthday? - " + twentyOne.getDayOfWeek());

        LocalTime arrival, depature;
        arrival = LocalTime.of(19, 25);
        depature = LocalTime.of(13, 45);
        System.out.println("How many minutes long is the train ride? - " + ChronoUnit.MINUTES.between(depature, arrival));
        System.out.println("If the train was delayed 1 hour 19 minutes, what is the actual arrival time? - " + arrival.plusHours(1).plusMinutes(19));

//        ZoneId boston = ZoneId.of("America/New_York");
//        ZoneId miami = ZoneId.of("America/Miami");
//        System.out.println(boston.getId());

        LocalDateTime start, end;
        start = LocalDateTime.of(2022, 3, 24, 21, 15);
        end = start.plusHours(4).plusMinutes(15);
        System.out.println("When does it arrive in Miami? - " + end);
        System.out.println("When does it arrive if the flight is delays 4 hours 27 minutes? - " + end.plusHours(4).plusMinutes(27));

        LocalDate secondTuesday, dano;
        secondTuesday = LocalDate.of(2021, 9, 1);
        if (secondTuesday.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
            secondTuesday = secondTuesday.with(next(DayOfWeek.TUESDAY));
        } else {
            secondTuesday = secondTuesday.with(next(DayOfWeek.TUESDAY));
            secondTuesday = secondTuesday.with(next(DayOfWeek.TUESDAY));
        }
        System.out.println(secondTuesday);

        LocalDate summer, temp1;
        summer = LocalDate.of(2021, 6, 25);
        long count = ChronoUnit.DAYS.between(summer, secondTuesday);
        temp1 = LocalDate.of(2021, 6, 25);
        long res = 0;
        for (int i = 0; i < count; i++) {
            if (!temp1.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !temp1.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                res = res + 1;
            }
            temp1 = temp1.plusDays(1);
        }
        res = res + 10 + 10;
        System.out.println("How many days of school are there? - " + res);

        ZoneId boston = ZoneId.of("America/New_York");
        ZoneId sanFrancisco = ZoneId.of("America/Los_Angeles");
        ZoneId bangalore = ZoneId.of("Asia/Calcutta");
        LocalDateTime temp2 = LocalDateTime.of(2014, 6, 13, 22, 30, 0);
        ZonedDateTime arrival1 = ZonedDateTime.of(temp2, sanFrancisco);
        OffsetDateTime arrival1Offset = arrival1.toOffsetDateTime();
        ZonedDateTime arrival1Boston = arrival1Offset.atZoneSameInstant(boston);
        System.out.println("What is the local time in Boston when the flight takes off? - " + arrival1Boston);
        System.out.println("What is the local time at Boston Logan airport when the flight arrives? - " + arrival1Boston.plusHours(5).plusMinutes(30));
        System.out.println("What is the local time in San Francisco when the flight arrives? - " + arrival1.plusMinutes(330));

        LocalDateTime temp3 = LocalDateTime.of(2014, 6, 28, 22, 30, 0);
        ZonedDateTime flight456 = ZonedDateTime.of(temp3, sanFrancisco);
        OffsetDateTime arrival2Offset = flight456.toOffsetDateTime();
        ZonedDateTime flight456Bangalore = arrival2Offset.atZoneSameInstant(bangalore);
        flight456Bangalore = flight456Bangalore.plusHours(22);
        LocalDateTime temp4 = LocalDateTime.of(2014, 6, 30, 9, 0, 0);
        ZonedDateTime meeting = ZonedDateTime.of(temp4, bangalore);
        System.out.println("Will the traveler make a meeting in Bangalore Monday at 9 AM local time? - " + flight456Bangalore.isBefore(meeting));
        flight456 = flight456.plusHours(22);
        if (flight456.getHour() > 8 && flight456.getHour() < 23) {
            System.out.println("Can the traveler call her husband at a reasonable time when she arrives? - yes");
        } else {
            System.out.println("Can the traveler call her husband at a reasonable time when she arrives? - no");
        }

        LocalDateTime temp5 = LocalDateTime.of(2014, 11, 1, 22, 30, 0);
        ZonedDateTime flight123Start = ZonedDateTime.of(temp5, sanFrancisco);
        OffsetDateTime arrival4Offset = flight123Start.toOffsetDateTime();
        ZonedDateTime flight123StartBoston = arrival4Offset.atZoneSameInstant(boston);
        System.out.println("What day and time does the flight arrive in Boston? - " + flight123StartBoston.plusMinutes(330));
        System.out.println((flight123StartBoston));

    }
}
