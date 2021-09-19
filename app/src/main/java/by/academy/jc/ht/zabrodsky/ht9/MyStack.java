package by.academy.jc.ht.zabrodsky.ht9;

public class MyStack<T> {

  private final LinkedList<T> linkedList = new LinkedList<>();

  public void push(T data) {
    linkedList.addElement(data);
  }

  public T pop() {
    return linkedList.deleteElement();
  }

  public T peek() {
    return linkedList.readTop();
  }

  public boolean isEmpty() {
    return linkedList.isEmpty();
  }
}
