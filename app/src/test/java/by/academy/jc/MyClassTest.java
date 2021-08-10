package by.academy.jc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyClassTest {

  @Test
  void myMarkForHomeworkNotNull() {
    MyClass classUnderTest = new MyClass();
    assertNotNull(classUnderTest.myMarkForHomework(1), "nine");
    assertSame("nine", classUnderTest.myMarkForHomework(1), "true");
  }
}

