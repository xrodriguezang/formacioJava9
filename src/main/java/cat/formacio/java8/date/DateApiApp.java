package cat.formacio.java8.date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateApiApp {

    public static void main (String[] args) {

        DayOfWeek dayOfWeek = LocalDate.parse("2023-05-18").getDayOfWeek();
        System.out.println(dayOfWeek);

        System.out.println(LocalDate.parse("2023-05-18").getDayOfMonth());
        System.out.println(LocalDate.parse("2023-05-18").getYear());

        LocalDate avui = LocalDate.now();

        System.out.println(avui);

        System.out.println(avui.minusDays(1));  // Restar un
        System.out.println(avui.isLeapYear()); // any bisiesto

        // VUll restar dues setmanes.
        System.out.println(avui.minus(2, ChronoUnit.WEEKS));  // restar dos cops

        LocalDate ahir = avui.minusDays(1);

        System.out.println(ahir.isBefore(avui));

        LocalDateTime ara = LocalDateTime.now();

        System.out.println(ara);

        System.out.println(avui.atStartOfDay());

        System.out.println(LocalDate.parse("2023-02-12").with(TemporalAdjusters.lastDayOfMonth()));

        System.out.println(LocalDate.of(2023, 3, 12));

        // Timezone

        Clock clock = Clock.systemDefaultZone(); // Agafa l'hora del sistema operatiu

        System.out.println(LocalDateTime.now(clock));  // Diferencia dels dos.

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");

        System.out.println(LocalDateTime.now(zoneId));

        Date date = new Date();

        LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        Calendar calendar = Calendar.getInstance();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());

        System.out.println(Period.between(ahir, avui));

        System.out.println(Period.between(ahir, avui).getMonths()); // Ara ja serà 0
        System.out.println(Period.between(ahir, avui).getDays()); // Ara ja serà 0

        LocalDateTime localFutureTime = ara.plus(Duration.ofMinutes(15)); // Es suma 15 minuts a l'hora d'ara.

        System.out.println(localFutureTime);


    }
}
