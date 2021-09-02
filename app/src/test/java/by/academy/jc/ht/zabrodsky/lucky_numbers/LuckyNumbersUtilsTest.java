package by.academy.jc.ht.zabrodsky.lucky_numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LuckyNumbersUtilsTest {

  @Test
  public void lookingForLuckyTicket1() {
    assertEquals(true, LuckyNumbersUtils.isLucky(1230));
  }

  @Test
  public void lookingForLuckyTicket2() {
    assertEquals(false, LuckyNumbersUtils.isLucky(239017));
  }

  @Test
  public void lookingForLuckyTicket3() {
    assertEquals(false, LuckyNumbersUtils.isLucky(11111));
  }

  @Test
  public void lookingForLuckyTicket4() {
    assertEquals(true, LuckyNumbersUtils.isLucky(2002));
  }

  // will be false, because >10E6
  @Test
  public void lookingForLuckyTicket5() {
    assertEquals(false, LuckyNumbersUtils.isLucky(20097301));
  }

}