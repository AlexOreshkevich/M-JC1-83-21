package by.academy.jc.ht.skopinov.ht9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MyStackTest {

  @Test
  void push() {
    MyStack<String> stack = new MyStack<>();
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");
    stack.push("5");
    stack.push("6");

    List<String> list = new LinkedList<>();
    list.add("6");
    list.add("5");
    list.add("4");
    list.add("3");
    list.add("2");
    list.add("1");
    assertIterableEquals(list, stack);
  }

  @Test
  void pop() {
    MyStack<Integer> stack = new MyStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    stack.pop();
    stack.pop();

    List<Integer> list = new LinkedList<>();
    list.add(2);
    list.add(1);
    assertIterableEquals(list, stack);
  }

  @Test
  void peek() {
    MyStack<Character> stack = new MyStack<>();
    stack.push('a');
    stack.push('b');
    stack.push('c');
    stack.push('d');
    stack.push('e');
    stack.push('f');
    stack.push('g');
    stack.push('h');
    stack.push('i');
    assertEquals('i', stack.peek());

    stack.pop();
    stack.pop();
    assertEquals('g', stack.peek());

    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    assertNull(stack.peek());
  }

  @Test
  void size() {
    MyStack<Character> stack = new MyStack<>();
    stack.push('a');
    stack.push('b');
    stack.push('c');
    stack.push('d');
    stack.push('e');
    stack.push('f');
    stack.push('g');
    stack.push('h');
    stack.push('i');
    int size = stack.size();
    assertEquals(9, size);
  }

  @Test
  void isEmpty() {
    MyStack<Integer> stack = new MyStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.pop();
    stack.pop();
    stack.pop();
    assertNull(stack.peek());
  }
}