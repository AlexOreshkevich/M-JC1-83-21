package by.academy.jc.skopinov.ht2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void sum() {
    int result1 = Calculator.sum(3, 5);
    assertEquals(23, result1, "the calculator is not working properly");
    double result2 = Calculator.sum(3.0, 5.0);
    assertEquals(23.0, result2, "the calculator is not working properly");
    short result3 = (short) Calculator.sum(3, 5);
    assertEquals(23, result3, "the calculator is not working properly");
    byte result4 = (byte) Calculator.sum(3, 5);
    assertEquals(23, result4, "the calculator is not working properly");
    int result5 = Calculator.sum(3, 5, 7);
    assertEquals(120, result5, "the calculator is not working properly");
  }
}