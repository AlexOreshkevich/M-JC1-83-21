package by.academy.jc.ht.zabrodsky.ht6_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

public class JulianCalendarTest {

  @Test
  public void addingTheDateAndTime1() {
    JulianCalendar myCalendar = new JulianCalendar(2020, 5, 20, 22, 30);
    assertEquals(LocalDateTime.of(2020, 5, 7, 22, 30), myCalendar.getDateTime());
    assertEquals(LocalDate.of(2020, 5, 7), myCalendar.getDate());
    assertEquals(LocalTime.of(22, 30), myCalendar.getTime());
  }

  @Test
  public void addingTheDateAndTime2() {
    JulianCalendar myCalendar = new JulianCalendar(2021, 9, 12);
    assertEquals(LocalDate.of(2021, 8, 30), myCalendar.getDate());

    myCalendar.setDate(2017, 7, 26);
    assertEquals(LocalDate.of(2017, 7, 13), myCalendar.getDate());
    assertEquals(LocalDateTime.of(2017, 7, 13, 0, 0), myCalendar.getDateTime());

  }

  @Test
  public void addingTheDateAndTime3() {
    JulianCalendar myCalendar = new JulianCalendar(2021, 9, 13,10,40);
    assertEquals(LocalTime.of(10, 40), myCalendar.getTime());
    myCalendar.setTime(11,50);
    assertEquals(LocalDateTime.of(2021, 8, 31, 11, 50), myCalendar.getDateTime());
  }



  @Test
  public void addingTheDate1() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(1582, 10, 15);
    assertEquals(LocalDate.of(1582, 10, 5), myCalendar.getDate());  // -10
  }

  @Test
  public void addingTheDate2() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(1700, 3, 12);
    assertEquals(LocalDate.of(1700, 3, 1), myCalendar.getDate());  // -11
  }

  @Test
  public void addingTheDate3() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(1850, 9, 3);
    assertEquals(LocalDate.of(1850, 8, 22), myCalendar.getDate());  // -12
  }

  @Test
  public void addingTheDate4() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(1950, 1, 7);
    assertEquals(LocalDate.of(1949, 12, 25), myCalendar.getDate());  // -13
  }

  @Test
  public void addingTheDate5() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(2200, 3, 15);
    assertEquals(LocalDate.of(2200, 3, 1), myCalendar.getDate());  // -14
  }

  @Test
  public void addingTheDate6() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(2200, 3, 16);
    assertEquals(LocalDate.of(2200, 3, 1), myCalendar.getDate());  // -15
  }

  @Test
  public void addingTheDate7() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(2400, 1, 1);
    assertEquals(LocalDate.of(2399, 12, 16), myCalendar.getDate());  // -16
  }

  @Test
  public void addingTheDateTime1() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(1582, 10, 15,1,1);
    assertEquals(LocalDateTime.of(1582, 10, 5,1,1), myCalendar.getDateTime());  // -10
  }

  @Test
  public void addingTheDateTime2() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(1700, 3, 12,1,1);
    assertEquals(LocalDateTime.of(1700, 3, 1,1,1), myCalendar.getDateTime());  // -11
  }

  @Test
  public void addingTheDateTime3() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(1850, 9, 3,1,1);
    assertEquals(LocalDateTime.of(1850, 8, 22,1,1), myCalendar.getDateTime());  // -12
  }

  @Test
  public void addingTheDateTime4() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(1950, 1, 7,1,1);
    assertEquals(LocalDateTime.of(1949, 12, 25,1,1), myCalendar.getDateTime());  // -13
  }

  @Test
  public void addingTheDateTime5() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(2200, 3, 15,1,1);
    assertEquals(LocalDateTime.of(2200, 3, 1,1,1), myCalendar.getDateTime());  // -14
  }

  @Test
  public void addingTheDateTime6() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(2200, 3, 16,1,1);
    assertEquals(LocalDateTime.of(2200, 3, 1,1,1), myCalendar.getDateTime());  // -15
  }

  @Test
  public void addingTheDateTime7() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(2400, 1, 1,1,1);
    assertEquals(LocalDateTime.of(2399, 12, 16,1,1), myCalendar.getDateTime());  // -16
  }

  @Test
  public void addingTheDateTime8() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDateTime(1400, 1, 1,1,1);
    assertEquals(null, myCalendar.getDateTime());
  }

  @Test
  public void addingTheDate8() {
    JulianCalendar myCalendar = new JulianCalendar();
    myCalendar.setDate(1400, 1, 1);
    assertEquals(null, myCalendar.getDate());
  }
}
