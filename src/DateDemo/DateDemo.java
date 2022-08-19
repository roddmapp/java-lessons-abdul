package DateDemo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        /**
         * OLD Date class which is mutable deprecated from Java 8  it contained both date and time
          */
          /*Date d = new Date();
          System.out.println(d);*/
        /**
         * LocaleDate class is not mutable it's immutable to change it you have to create a new object
         * For getting the Date
         */
        LocalDate d = LocalDate.now();//represents just date todays date
        LocalDate d1 = d.plusMonths(6);
        System.out.println(d);
        System.out.println(d1);

        //For getting the time
        LocalTime t = LocalTime.now();
        LocalTime t2= t.minusHours(3);
        System.out.println(t);
        System.out.println(t2);

        //for date and time together
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //for month and day
        MonthDay md = MonthDay.now();
        System.out.println(md);

        //for yearmonth
        YearMonth ym = YearMonth.now();
        System.out.println(ym);

        //for year only
        Year y = Year.now();
        System.out.println(y);

        //getting Period
        Period p = Period.of(2,2,10);
        System.out.println(p.addTo(LocalDate.now())); //adding 2 yrs 2 months 10 days to currentdate gives a new date

        //getting time using Instant which gives us the time back in gmt
        Instant i = Instant.now();
        System.out.println(i);

        /**
         * DateTimeFormatter
         * y-year M-month d-day h-Hour(0-12) H-Hour(0-23) m-minute s-seconds S-milliseconds z-time zone Z-offset
         */

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        System.out.println(df.format(ldt));
    }
}
