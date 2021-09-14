package by.academy.jc.ht.zhabko;


import java.time.LocalDate;
import java.time.chrono.AbstractChronology;
import java.time.chrono.Era;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
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
        LocalDate localDate = LocalDate.of(Year,month,dayOfMonth);
        LocalDate baseDateISO = LocalDate.of(-3114,
                8,
                12);
        long daysBetween = ChronoUnit.DAYS.between(baseDateISO,localDate);

        return MayanLocalDate.correlationDate().plusDays(daysBetween);
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
