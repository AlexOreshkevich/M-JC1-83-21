package by.academy.jc.ht.zabrodsky.ht6_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

public class JulianCalendarTest {

  @Test
  public void addingTheDateAndTime_1() {
    JulianCalendar myCalendar1 = new JulianCalendar(2020, 5, 20, 22, 30);
    assertEquals(LocalDateTime.of(2020, 5, 7, 22, 30), myCalendar1.getDateTime());
    assertEquals(LocalDate.of(2020, 5, 7), myCalendar1.getDate());
    assertEquals(LocalTime.of(22, 30), myCalendar1.getTime());
  }

  @Test
  public void addingTheDateAndTime_2() {
    JulianCalendar myCalendar2 = new JulianCalendar(2021, 9, 12);
    assertEquals(LocalDate.of(2021, 8, 30), myCalendar2.getDate());

    myCalendar2.setDate(2017, 7, 26);
    assertEquals(LocalDate.of(2017, 7, 13), myCalendar2.getDate());
    assertEquals(LocalDateTime.of(2017, 7, 13, 0, 0), myCalendar2.getDateTime());

  }

  @Test
  public void addingTheDate_1() {
    JulianCalendar myCalendar3 = new JulianCalendar();
    myCalendar3.setDate(1582, 10, 15);
    assertEquals(LocalDate.of(1582, 10, 5), myCalendar3.getDate());  // -10
  }

  @Test
  public void addingTheDate_2() {
    JulianCalendar myCalendar4 = new JulianCalendar();
    myCalendar4.setDate(1700, 3, 12);
    assertEquals(LocalDate.of(1700, 3, 1), myCalendar4.getDate());  // -11
  }

  @Test
  public void addingTheDate_3() {
    JulianCalendar myCalendar5 = new JulianCalendar();
    myCalendar5.setDate(1850, 9, 3);
    assertEquals(LocalDate.of(1850, 8, 22), myCalendar5.getDate());  // -12
  }

  @Test
  public void addingTheDate_4() {
    JulianCalendar myCalendar6 = new JulianCalendar();
    myCalendar6.setDate(1950, 1, 7);
    assertEquals(LocalDate.of(1949, 12, 25), myCalendar6.getDate());  // -13
  }

  @Test
  public void addingTheDate_5() {
    JulianCalendar myCalendar7 = new JulianCalendar();
    myCalendar7.setDate(2200, 3, 15);
    assertEquals(LocalDate.of(2200, 3, 1), myCalendar7.getDate());  // -14
  }

  @Test
  public void addingTheDate_6() {
    JulianCalendar myCalendar8 = new JulianCalendar();
    myCalendar8.setDate(2200, 3, 16);
    assertEquals(LocalDate.of(2200, 3, 1), myCalendar8.getDate());  // -15
  }

  @Test
  public void addingTheDate_7() {
    JulianCalendar myCalendar9 = new JulianCalendar();
    myCalendar9.setDate(2400, 1, 1);
    assertEquals(LocalDate.of(2399, 12, 16), myCalendar9.getDate());  // -16
  }
}
