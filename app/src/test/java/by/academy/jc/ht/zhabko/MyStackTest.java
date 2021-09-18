package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void shouldPushAllIntegerObjects() {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);
        testObject.push(4);
        testObject.push(5);
        assertEquals(5,testObject.peek());
    }

    @Test
    void shouldPushAllStringObjects() {
        MyStack <String> testObject = new MyStack<>();
        testObject.push("Test");
        testObject.push("Java");
        testObject.push("Code");
        testObject.push("Implementation");
        testObject.push("MyStack");
        assertEquals("MyStack",testObject.peek());
    }

    @Test
    void shouldPushCorrectNumberOfObjects() {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);
        testObject.push(4);
        testObject.push(5);
        assertEquals(5,testObject.getSize());
    }

    @Test
    void shouldPopAndReturnIntegerObject() {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        testObject.push(2);
        testObject.push(3);
        testObject.push(4);
        testObject.push(5);
        testObject.pop();
        assertEquals(4,testObject.peek());
    }

    @Test
    void shouldPopAndReturnStringObject() {
        MyStack <String> testObject = new MyStack<>();
        testObject.push("Test");
        testObject.push("Java");
        testObject.push("Code");
        testObject.push("Implementation");
        testObject.push("MyStack");
        testObject.pop();
        assertEquals("Implementation",testObject.peek());
    }

    @Test
    void shouldReturnTrueOnEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        assertTrue(testObject.isEmpty());
    }

    @Test
    void shouldReturnFalseOnNonEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        testObject.push(1);
        assertFalse(testObject.isEmpty());
    }

    @Test
    void shouldThrowRuntimeExceptionOnPeekOnEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        Exception exception = assertThrows(RuntimeException.class, testObject::peek);
        String actualMessage = exception.getMessage();
        String expectedMessage = "Current MyStack is empty";
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void shouldThrowRuntimeExceptionOnPoPOnEmptyMyStack() {
        MyStack <Integer> testObject = new MyStack<>();
        Exception exception = assertThrows(RuntimeException.class, testObject::pop);
        String actualMessage = exception.getMessage();
        String expectedMessage = "Current MyStack is empty";
        assertEquals(expectedMessage,actualMessage);
    }
}
