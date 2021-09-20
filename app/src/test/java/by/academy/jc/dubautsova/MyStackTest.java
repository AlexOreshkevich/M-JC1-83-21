package by.academy.jc.dubautsova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStackTest {
    @Test
    public void shouldReturnLastInteger1() {
        MyStack<Integer> myObject;
        myObject = new MyStack<>();
        myObject.push(1);
        myObject.push(2);
        myObject.push(3);
        myObject.push(4);
        myObject.push(5);
        myObject.push(6);
        assertEquals(6, myObject.peek());
    }

    @Test
    public void shouldReturnLastInteger2() {
        MyStack<Integer> myObject;
        myObject = new MyStack<>();
        myObject.push(1);
        myObject.push(2);
        myObject.push(3);
        myObject.push(4);
        myObject.push(5);
        myObject.push(6);
        assertEquals(6, myObject.peek());
        myObject.pop();
        assertEquals(5, myObject.peek());
    }

    @Test
    public void returningStringObjectsUsing() {
        MyStack<String> myObject;
        myObject = new MyStack<>();
        myObject.push("String1");
        myObject.push("String2");
        myObject.push("String3");
        myObject.push("String4");
        myObject.push("String5");
        myObject.push("String6");
        myObject.pop();
        myObject.pop();
        assertEquals("String4", myObject.peek());
    }

    @Test
    public void isMyStackEmpty() {
        MyStack<String> myObject;
        myObject = new MyStack<>();
        assertEquals(true, myObject.isEmpty());
        myObject.push("String1");
        myObject.push("String2");
        myObject.pop();
        myObject.pop();
        assertTrue(myObject.isEmpty());
    }
}

