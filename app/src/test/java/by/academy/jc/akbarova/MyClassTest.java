package by.academy.jc.akbarova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MyClassTest {

  @Test
  void should_HaveTheMessage_WhenCompile() {
    MyClass classUnderTest = new MyClass();
    assertNotNull(classUnderTest.getMessage(), "app should have a message");
  }
}