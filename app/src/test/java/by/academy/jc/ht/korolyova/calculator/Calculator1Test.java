package by.academy.jc.ht.korolyova.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Calculator1Test {

  @Test
  void shouldExpectCorrectResultWhenSum() {
    Calculator1 Tes = new Calculator1();
    assertEquals(5, Tes.sum1(1, 2));
  }
}