package br.com.java8.data;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DataHora {

    public static void main(String[] args) {

        // LocalDate - representa uma data: 06/08/1990
        LocalDate ldNow = LocalDate.now();
        System.out.println(ldNow + " Local Date" + "\n");

        LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
        System.out.println(ld + "\n");

        LocalDate ld2 = ld.plusWeeks(2).plusDays(1).minusMonths(1);
        System.out.println(ld2 + "\n");


        // LocalTime - representa uma hora: 11:40:00
        LocalTime ltNow = LocalTime.now();
        System.out.println(ltNow + " Local Time" + "\n");

        LocalTime lt = LocalTime.of(11, 10, 01, 100000);
        System.out.println(lt + "\n");


        // LocalDateTime - representa data+hora:
        // 06/08/1990 11:40:00
        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println(ldtNow + " Local Date Time" + "\n");
        LocalDateTime ldt = LocalDateTime.of(2020, 10, 25, 19, 52, 36, 896);
        System.out.println(ldt +  "\n");


        // ZonedDateTime - LocalDateTime com
        // TimeZone (fuso horário)
        // 06/08/1990 11:40:00 GMT-3 (America/Sao_Paulo)
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println(zdtNow + " Zoned Date Time" + "\n");
        ZoneId zoneId = ZoneId.of("North America/New York");
        ZonedDateTime zdt = ZonedDateTime.of(ld, lt, zoneId);
        System.out.println(zdt);

    }
}
