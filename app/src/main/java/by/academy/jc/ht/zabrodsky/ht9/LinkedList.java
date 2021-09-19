package by.academy.jc.ht.zabrodsky.ht9;

public class LinkedList<T> {

  public static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> first = null;

  // used for push
  public void addElement(T data) {
    Node<T> newFirst = new Node<T>(data);
    newFirst.next = first;
    first = newFirst;
  }

  // used for pop
  public T deleteElement() {
    if (isEmpty()) {
      throw new NullPointerException("MyStack is empty");
    }
    Node<T> oldFirst = first;
    first = first.next;
    return oldFirst.data;
  }

  // used for peek
  public T readTop() {
    if (isEmpty()) {
      throw new NullPointerException("MyStack is empty");
    }
    Node<T> oldFirst = first;
    return oldFirst.data;
  }

  public boolean isEmpty() {
    return first == null;
  }
}