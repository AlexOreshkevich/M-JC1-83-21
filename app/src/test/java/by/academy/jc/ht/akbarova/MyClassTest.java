package by.academy.jc.ht.akbarova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyClassTest {

  @Test
  void shouldHaveTheMessageWhenCompile() {
    MyClass classUnderTest = new MyClass();
    assertEquals("Hi for everyone!", classUnderTest.getMessage());
  }
}
