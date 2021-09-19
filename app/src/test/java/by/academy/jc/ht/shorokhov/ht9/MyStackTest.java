package by.academy.jc.ht.shorokhov.ht9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyStackTest {

    @Test
    public void testPush() throws Exception {
        MyStack stack = new MyStack(5);
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.push(2);
        stack.push(3);


    }

    @Test
    public void testPop() throws Exception {
        MyStack stack = new MyStack(5);
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testPeek() throws Exception {
        MyStack stack = new MyStack(5);
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        System.out.println(stack.peek());
    }
    @Test
    public void testSize() throws Exception {
        MyStack stack = new MyStack(2);
        stack.push(1);
        assertEquals(1, stack.size());
    }

}
