package by.academy.jc.ht.zabrodsky.ht9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyStackTest {

  @Test
  public void returningIntegerObjectsUsing1() {
    MyStack<Integer> myObject;
    myObject = new MyStack<>();
    myObject.push(1);
    myObject.push(2);
    myObject.push(3);
    myObject.push(4);
    myObject.push(5);
    myObject.push(6);
    myObject.push(7);
    assertEquals(7, myObject.peek());
  }

  @Test
  public void returningIntegerObjectsUsing2() {
    MyStack<Integer> myObject;
    myObject = new MyStack<>();
    myObject.push(1);
    myObject.push(2);
    myObject.push(3);
    myObject.push(4);
    myObject.push(5);
    myObject.push(6);
    myObject.push(7);
    assertEquals(7, myObject.peek());
    myObject.pop();
    assertEquals(6, myObject.peek());
  }

  @Test
  public void returningStringObjectsUsing1() {
    MyStack<String> myObject;
    myObject = new MyStack<>();
    myObject.push("text1");
    myObject.push("text2");
    myObject.push("text3");
    myObject.push("text4");
    myObject.push("text5");
    myObject.push("text6");
    myObject.push("text7");
    myObject.pop();
    myObject.pop();
    assertEquals("text5", myObject.peek());
  }

  @Test
  public void returningStringObjectsUsing2() {
    MyStack<String> myObject;
    myObject = new MyStack<>();
    myObject.push("text1");
    myObject.push("text2");
    myObject.push("text3");
    myObject.push("text4");
    myObject.push("text5");
    myObject.push("text6");
    myObject.push("text7");
    myObject.pop();
    myObject.pop();
    assertEquals(5, myObject.size());
  }

  @Test
  public void returningNullObjectsUsing1() {
    MyStack<String> myObject;
    myObject = new MyStack<>();
    assertEquals(true, myObject.isEmpty());
  }

  @Test
  public void returningNullObjectsUsing2() {
    MyStack<String> myObject;
    myObject = new MyStack<>();
    assertTrue(myObject.isEmpty());
    myObject.push("text1");
    myObject.push("text2");
    myObject.pop();
    myObject.pop();
    assertEquals(0, myObject.size());
  }

}