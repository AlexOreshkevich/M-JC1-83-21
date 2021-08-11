package by.academy.jc.akbarova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MyClassTest {

    @Test
    void shouldHaveTheMessageWhenCompile() {
        MyClass classUnderTest = new MyClass();
        assertEquals("Hi for everyone!", classUnderTest.getMessage());
    }
}
