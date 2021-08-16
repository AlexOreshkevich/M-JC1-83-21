package by.academy.jc.skopinov.ht2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  void sum() {
    assertEquals(23, calculator.sum(3, 5), "the calculator is not working properly");
    assertEquals(23.0, calculator.sum(3.0, 5.0), "the calculator is not working properly");
    assertEquals(23, calculator.sum(3, 5), "the calculator is not working properly");
    assertEquals(23, calculator.sum(3, 5), "the calculator is not working properly");
    assertEquals(120, calculator.sum(3, 5, 7), "the calculator is not working properly");
  }
}