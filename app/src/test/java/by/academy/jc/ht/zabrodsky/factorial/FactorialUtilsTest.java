package by.academy.jc.ht.zabrodsky.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialUtilsTest {

  @Test
  public void returnsTheFactorialOfAnInteger3() {
    assertEquals(120, FactorialUtils.fact(5));
  }

  @Test
  public void returnsTheFactorialOfAnInteger4() {
    assertEquals(3628800, FactorialUtils.fact(10));
  }

  @Test
  public void returnsTheFactorialOfAnInteger5() {
    assertEquals(24, FactorialUtils.factRec(4));
  }

  @Test
  public void returnsTheFactorialOfAnInteger8() {
    assertEquals(39916800, FactorialUtils.factRec(11));
  }
}

