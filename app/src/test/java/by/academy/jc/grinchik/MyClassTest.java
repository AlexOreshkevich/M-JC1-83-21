package by.academy.jc.grinchik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyClassTest {

    @Test
    void classHasVersion() {
        MyClass classUnderTest = new MyClass();
        String[] args = {"--version"};
        assertEquals("App version 1.2.3.4", classUnderTest.getString(args));
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