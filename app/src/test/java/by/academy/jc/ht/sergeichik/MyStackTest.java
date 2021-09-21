package by.academy.jc.ht.sergeichik;

import by.academy.jc.ht.sergeichik.ht9.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    @Test
    void pushAllElements() {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        assertEquals(5,myStack.peek());
    }

    @Test
    void pushAllElements1() {
        MyStack <String> myStack = new MyStack<>();
        myStack.push("c");
        myStack.push("b");
        myStack.push("a");
        myStack.push("abc");
        myStack.push(" ");
        assertEquals(" ",myStack.peek());
    }

    @Test
    void popElements() {
        MyStack <Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.pop();
        assertEquals(3,myStack.peek());
    }

    @Test
    void popElements1() {
        MyStack <String> myStack = new MyStack<>();
        myStack.push("z");
        myStack.push("y");
        myStack.push("x");
        myStack.push("w");
        myStack.pop();
        assertEquals("x",myStack.peek());
    }
}
