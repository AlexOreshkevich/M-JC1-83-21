package by.academy.jc.ht.zabrodsky.ht6_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JulianCalendar {

  private int year;
  private int month;
  private int dayOfMonth;
  private int hour;
  private int minute;

  public JulianCalendar() {

  }

  public JulianCalendar(int year, int month, int dayOfMonth, int hour, int minute) {
    this.year = year;
    this.month = month;
    this.dayOfMonth = dayOfMonth;
    this.hour = hour;
    this.minute = minute;
  }

  public JulianCalendar(int year, int month, int dayOfMonth) {
    this.year = year;
    this.month = month;
    this.dayOfMonth = dayOfMonth;
  }

  public JulianCalendar(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  public void setDateTime(int year, int month, int dayOfMonth, int hour, int minute) {
    this.year = year;
    this.month = month;
    this.dayOfMonth = dayOfMonth;
    this.hour = hour;
    this.minute = minute;
  }

  public void setDate(int year, int month, int dayOfMonth) {
    this.year = year;
    this.month = month;
    this.dayOfMonth = dayOfMonth;
  }

  public void setTime(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  public final LocalDateTime getDateTime() {
    int y = this.year;
    int m = this.month;
    int d = this.dayOfMonth;
    int h = this.hour;
    int min = this.minute;
    return conversionToTheJulianCalendar(y, m, d, h, min);

  }

  public final LocalDate getDate() {
    int y = this.year;
    int m = this.month;
    int d = this.dayOfMonth;
    return conversionToTheJulianCalendar(y, m, d);
  }

  public final LocalTime getTime() {
    return LocalTime.of(hour, minute);
  }

  public LocalDateTime conversionToTheJulianCalendar(int y, int m, int d, int h, int min) {
    LocalDate date = LocalDate.of(y, m, d);
    if (date.isBefore(LocalDate.of(1700, 3, 12))
        && date.isAfter(LocalDate.of(1582, 10, 14))) {
      return LocalDateTime.of(y, m, d, h, min).minusDays(10);
    }
    else if (date.isBefore(LocalDate.of(1800, 3, 13))
        && date.isAfter(LocalDate.of(1700, 3, 11))) {
      return LocalDateTime.of(y, m, d, h, min).minusDays(11);
    }
    else if (date.isBefore(LocalDate.of(1900, 3, 14))
        && date.isAfter(LocalDate.of(1800, 3, 12))) {
      return LocalDateTime.of(y, m, d, h, min).minusDays(12);
    }
    else if (date.isBefore(LocalDate.of(2100, 3, 15))
        && date.isAfter(LocalDate.of(1900, 3, 13))) {
      return LocalDateTime.of(y, m, d, h, min).minusDays(13);
    }
    else if (date.isBefore(LocalDate.of(2200, 3, 16))
        && date.isAfter(LocalDate.of(2100, 3, 14))) {
      return LocalDateTime.of(y, m, d, h, min).minusDays(14);
    }
    else if (date.isBefore(LocalDate.of(2300, 3, 17))
        && date.isAfter(LocalDate.of(2200, 3, 15))) {
      return LocalDateTime.of(y, m, d, h, min).minusDays(15);
    }
    else if (date.isBefore(LocalDate.of(2500, 3, 18))
        && date.isAfter(LocalDate.of(2300, 3, 16))) {
      return LocalDateTime.of(y, m, d, h, min).minusDays(16);
    }
    return null;
  }

  private LocalDate conversionToTheJulianCalendar(int y, int m, int d) {
    LocalDate date = LocalDate.of(y, m, d);
    if (date.isBefore(LocalDate.of(1700, 3, 12))
        && date.isAfter(LocalDate.of(1582, 10, 14))) {
      return LocalDate.of(y, m, d).minusDays(10);
    }
    else if (date.isBefore(LocalDate.of(1800, 3, 13))
        && date.isAfter(LocalDate.of(1700, 3, 11))) {
      return LocalDate.of(y, m, d).minusDays(11);
    }
    else if (date.isBefore(LocalDate.of(1900, 3, 14))
        && date.isAfter(LocalDate.of(1800, 3, 12))) {
      return LocalDate.of(y, m, d).minusDays(12);
    }
    else if (date.isBefore(LocalDate.of(2100, 02, 15))
        && date.isAfter(LocalDate.of(1900, 3, 13))) {
      return LocalDate.of(y, m, d).minusDays(13);
    }
    else if (date.isBefore(LocalDate.of(2200, 3, 16))
        && date.isAfter(LocalDate.of(2100, 3, 14))) {
      return LocalDate.of(y, m, d).minusDays(14);
    }
    else if (date.isBefore(LocalDate.of(2300, 3, 17))
        && date.isAfter(LocalDate.of(2200, 3, 15))) {
      return LocalDate.of(y, m, d).minusDays(15);
    }
    else if (date.isBefore(LocalDate.of(2500, 3, 18))
        && date.isAfter(LocalDate.of(2300, 3, 16))) {
      return LocalDate.of(y, m, d).minusDays(16);
    }
    return null;
  }
}

