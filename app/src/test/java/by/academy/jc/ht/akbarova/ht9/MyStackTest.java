package by.academy.jc.ht.akbarova.ht9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStackTest {
    @Test
    void shouldReturnLastInteger1() {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        assertEquals(6, myStack.peek());
    }

    @Test
    void shouldReturnLastInteger2() {
        MyStack<Integer> myStack= new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        assertEquals(6, myStack.peek());
        myStack.pop();
        assertEquals(5, myStack.peek());
    }

    @Test
    void returningStringObjectsUsing() {
        MyStack<String> myStack= new MyStack<>();
        myStack.push("String1");
        myStack.push("String2");
        myStack.push("String3");
        myStack.push("String4");
        myStack.push("String5");
        myStack.push("String6");
        myStack.pop();
        myStack.pop();
        assertEquals("String4", myStack.peek());
    }

    @Test
    void isMyStackEmpty() {
        MyStack<String> myStack= new MyStack<>();
        assertTrue(myStack.isEmpty());
        myStack.push("String1");
        myStack.push("String2");
        myStack.pop();
        myStack.pop();
        assertTrue(myStack.isEmpty());
        assertEquals(0,myStack.size());
    }
}