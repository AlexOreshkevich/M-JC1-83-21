package by.academy.jc.dubautsova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.*;
import java.time.temporal.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static java.time.chrono.IsoEra.BCE;
import static java.time.chrono.IsoEra.CE;
import static java.time.temporal.ChronoField.EPOCH_DAY;


public class JulianChronology extends AbstractChronology {

    private int prolepticYear;
    private int month;
    private int dayOfMonth;
    private int dayOfYear;
    private long epochDay;
    private int yearOfEra;
    private int eraValue;
    private Era era;
// there are some problems with unit tests, that's why main is here
    public static void main(String[] args) throws ParseException {
        System.out.println(toJulianCalendarFromGregorian("1590-09-11"));
        System.out.println(toJulianCalendarFromGregorian("1899-10-19"));
        System.out.println(toJulianCalendarFromGregorian("2021-09-12"));
        System.out.println(diffBetweenCalInDaysFromGregToJul("1590-09-01"));
        System.out.println(diffBetweenCalInDaysFromGregToJul("1899-10-19"));
        System.out.println(diffBetweenCalInDaysFromGregToJul("2021-09-12"));
    }

    @Override
    public String getId() {
        return "Julian";
    }

    @Override
    public String getCalendarType() {
        return "julian";
    }

    @Override
    public ChronoLocalDate date(int prolepticYear, int month, int dayOfMonth) {
        this.prolepticYear = prolepticYear;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        return LocalDate.of(prolepticYear, month, dayOfMonth);
    }

    @Override
    public ChronoLocalDate dateYearDay(int prolepticYear, int dayOfYear) {
        this.prolepticYear = prolepticYear;
        this.dayOfYear = dayOfYear;
        return LocalDate.ofYearDay(prolepticYear, dayOfYear);
    }

    @Override
    public ChronoLocalDate dateEpochDay(long epochDay) {
        this.epochDay = epochDay;
        return LocalDate.ofEpochDay(epochDay);
    }

    @Override
    public ChronoLocalDate date(TemporalAccessor temporal) {
        if (temporal instanceof ChronoLocalDate) {
            return (ChronoLocalDate) temporal;
        }
        return LocalDate.from(temporal);
    }

    @Override
    public boolean isLeapYear(long prolepticYear) {
        return IsoChronology.INSTANCE.isLeapYear(prolepticYear);
    }

    @Override
    public int prolepticYear(Era era, int yearOfEra) {
        this.era = era;
        this.yearOfEra = yearOfEra;
        return yearOfEra;
    }

    @Override
    public Era eraOf(int eraValue) {
        this.eraValue = eraValue;
        if (eraValue == 0) {
            return BCE;}
        else return CE;
    }

    @Override
    public List<Era> eras() {
        return List.of(IsoEra.values());
    }

    @Override
    public ValueRange range(ChronoField field) {
        return null;
    }

    // it works for the dates after October 15th, 1582 (GregCalendar started be used)
    public static String toJulianCalendarFromGregorian(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        GregorianCalendar gcal = new GregorianCalendar();
        sdf.setCalendar(gcal);
        Date d = sdf.parse(date);
        gcal.setGregorianChange( new Date(Long.MAX_VALUE));
        gcal.setTime(d);
        return sdf.format(d);
    }

    public static int diffBetweenCalInDaysFromGregToJul (String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1new = sdf.parse(date);
        Date date2new = sdf.parse(toJulianCalendarFromGregorian(date));
        return (int) (date1new.getTime() - date2new.getTime()) / 3600000 / 24;
    }
}

