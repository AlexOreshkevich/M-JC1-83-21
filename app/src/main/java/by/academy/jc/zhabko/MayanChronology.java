package by.academy.jc.zhabko;

import java.time.chrono.AbstractChronology;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Era;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.ValueRange;
import java.util.List;

public class MayanChronology extends AbstractChronology {



    public static MayanChronology INSTANCE = new MayanChronology();
    @Override
    public String getId() {
        return "MayanId";
    }

    @Override
    public String getCalendarType() {
        return "Mayan Calendar";
    }

    @Override
    public MayanLocalDate date(int Year, int month, int dayOfMonth) {
        Year = Year % 20;
        month = (month*30) % 20;
        dayOfMonth = (dayOfMonth*30) % 20;
        return MayanLocalDate.of(13,0,Year,month,dayOfMonth);
    }

    @Override
    public MayanLocalDate dateYearDay(int prolepticYear, int dayOfYear) {
        return null;
    }

    @Override
    public MayanLocalDate dateEpochDay(long epochDay) {
        return null;
    }

    @Override
    public MayanLocalDate date(TemporalAccessor temporal) {
        return null;
    }

    @Override
    public boolean isLeapYear(long prolepticYear) {
        return false;
    }

    @Override
    public int prolepticYear(Era era, int yearOfEra) {
        return 0;
    }

    @Override
    public Era eraOf(int eraValue) {
        return null;
    }

    @Override
    public List<Era> eras() {
        return null;
    }

    @Override
    public ValueRange range(ChronoField field) {
        return null;
    }
}
