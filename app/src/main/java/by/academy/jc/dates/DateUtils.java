package by.academy.jc.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DateUtils {

    public static List<LocalDate> getMondays(LocalDate date) {
        int currentMonth = date.getMonth().getValue();
        List<LocalDate> mondaysList = new ArrayList<>();

        LocalDate firstDay = date.withDayOfMonth(1);
        LocalDate nextDay = firstDay;
        for (;;) {
            // reached next month
            if (nextDay.getMonth().getValue() != currentMonth) {
                break;
            }
            nextDay = nextDay.plus(1, ChronoUnit.DAYS);

            if (nextDay.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                mondaysList.add(nextDay);
            }
        }
        return mondaysList;
    }
}
