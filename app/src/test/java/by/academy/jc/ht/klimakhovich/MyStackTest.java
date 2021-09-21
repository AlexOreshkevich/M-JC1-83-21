package by.academy.jc.ht.klimakhovich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    public void shouldReturnLastNumber() {
        MyStack<Integer> num;
        num = new MyStack<>();
        num.push(1);
        num.push(1);
        num.push(2);
        num.push(8);
        num.push(9);
        num.push(6);
        assertEquals(6, num.peek());
    }
    @Test
    public void shouldReturnSecondToLastNumber() {
        MyStack<Integer> num;
        num = new MyStack<>();
        num.push(1);
        num.push(1);
        num.push(2);
        num.push(8);
        num.push(9);
        num.push(6);
        num.pop();
        assertEquals(9, num.peek());
    }
    @Test
    public void shouldReturnSecondToLastString() {
        MyStack<String> str;
        str = new MyStack<>();
        str.push("txt1");
        str.push("txt2");
        str.push("txt3");
        str.push("txt4");
        str.push("txt5");
        str.push("txt13466");
        str.push("7");
        str.pop();
        assertEquals("txt13466", str.peek());
    }
}