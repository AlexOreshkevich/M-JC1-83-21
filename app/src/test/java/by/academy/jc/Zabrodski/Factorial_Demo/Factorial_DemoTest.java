package by.academy.jc.Zabrodski.Factorial_Demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Factorial_DemoTest {


  @Test
  public void returnsTheFactorialOfAnInteger1() {
    assertEquals(1, Factorial_Demo.fact(0));
  }

  @Test
  public void returnsTheFactorialOfAnInteger2() {
    assertEquals(1, Factorial_Demo.fact(1));
  }

  @Test
  public void returnsTheFactorialOfAnInteger3() {
    assertEquals(120, Factorial_Demo.fact(5));
  }

  @Test
  public void returnsTheFactorialOfAnInteger4() {
    assertEquals(3628800, Factorial_Demo.fact(10));
  }

  @Test
  public void returnsTheFactorialOfAnInteger5() {
    assertEquals(24, Factorial_Demo.factRec(4));
  }

  @Test
  public void returnsTheFactorialOfAnInteger6() {
    assertEquals(1, Factorial_Demo.factRec(0));
  }

  @Test
  public void returnsTheFactorialOfAnInteger7() {
    assertEquals(2, Factorial_Demo.factRec(2));
  }

  @Test
  public void returnsTheFactorialOfAnInteger8() {
    assertEquals(39916800, Factorial_Demo.factRec(11));
  }
}

