package by.academy.jc.ht.shorokhov.ht9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyStackTest {

    @Test
    public void testPushAndPeek() throws Exception {
        MyStack<Integer> stack = new MyStack();
        stack.push(5);
        stack.push(15);
        stack.push(6);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());


    }

    @Test
    public void testPopAndPeek() throws Exception {
        MyStack<Integer> stack = new MyStack();
        stack.push(2);
        stack.push(12);
        stack.push(3);
        stack.push(9);
        stack.push(143);
        assertEquals(143, stack.peek());
        stack.pop();
        assertEquals(9, stack.peek());


    }

    @Test
    public void testSizeAndEmpty() throws Exception {
        MyStack<Integer> stack = new MyStack();
        stack.push(2);
        stack.push(12);
        stack.push(3);
        stack.push(9);
        stack.push(143);
        assertEquals(5, stack.size());
        assertEquals(false, stack.isEmpty());


    }

    @Test
    public void testPopAndPeekStrings() throws Exception {
        MyStack<String> stack = new MyStack();
        stack.push("2");
        stack.push("12");
        stack.push("3");
        stack.push("9");
        stack.push("143");
        assertEquals("143", stack.peek());
        stack.pop();
        assertEquals("9", stack.peek());


    }

    @Test
    public void testPopAndPeekString() throws Exception {
        MyStack<String> stack = new MyStack();
        stack.push("2");
        stack.push("12");
        stack.push("3");
        stack.push("9");
        stack.push("143");
        assertEquals("143", stack.peek());
        stack.pop();
        assertEquals("9", stack.peek());


    }

    @Test
    public void testSizeAndEmptyString() throws Exception {
        MyStack<String> stack = new MyStack();
        stack.push("2");
        stack.push("12");
        stack.push("3");
        stack.push("9");
        stack.push("143");
        assertEquals(5, stack.size());
        assertEquals(false, stack.isEmpty());


    }

    @Test
    public void testEmptyStack() throws Exception {
        MyStack<String> stack = new MyStack();
        assertEquals(true, stack.isEmpty());
    }
}
