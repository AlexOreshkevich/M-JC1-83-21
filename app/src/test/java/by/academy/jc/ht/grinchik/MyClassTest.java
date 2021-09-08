package by.academy.jc.ht.grinchik;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyClassTest {

  @Test
  void classHasVersion() {
    MyClass classUnderTest = new MyClass();
    String[] args = {"--version"};
    MyClass.main(args);
    assertEquals(MyClass.version(), classUnderTest.getString(args));
  }

  @Test
  void classEmptyArgs() {
    MyClass classUnderTest = new MyClass();
    String[] args = {};
    assertEquals("", classUnderTest.getString(args));
  }

  @Test
  void classInvalidArgs() {
    MyClass classUnderTest = new MyClass();
    String[] args = {"--desk"};
    assertEquals("", classUnderTest.getString(args));
  }
}