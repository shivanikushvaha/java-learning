package week2.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date1 {
    public static void main(String[] args) {
        String date = "12-05-2024";

        LocalDate localDate = LocalDate.of(2024, 4, 26);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getChronology());

        System.out.println("=======================");

        LocalTime localTime = LocalTime.of(5, 5, 5, 2);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

    }
}
