package by.academy.jc.ht.zabrodsky.ht9;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyStack<E> implements Iterable<E> {

  private int size = 0;
  private Item<E> last;

  @Override
  public Iterator<E> iterator() {
    return new MyIterator();
  }

  private class Item<E> {

    E data;
    Item<E> next;

    Item(E element, Item<E> next) {
      this.data = element;
      this.next = next;
    }

  }

  class MyIterator implements Iterator<E> {

    private Item<E> current;
    private int nextIndex;

    MyIterator() {
      current = last;
      nextIndex = 0;
    }

    @Override
    public boolean hasNext() {
      return nextIndex < size;
    }

    @Override
    public E next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }

      Item<E> lastReturned = current;
      current = current.next;
      nextIndex++;
      return lastReturned.data;
    }
  }

  public int size() {
    return size;
  }

  void push(E item) {
    final Item<E> newItem = new Item<E>(item, null);
    newItem.next = last;
    last = newItem;
    size++;
  }

  public void pop() {
    if (isEmpty()) {
      throw new NullPointerException("MyStack is empty");
    }
    last = last.next;
    size--;
  }

  public E peek() {
    if (isEmpty()) {
      throw new NullPointerException("MyStack is empty");
    }
    return last.data;
  }

  public boolean isEmpty() {
    return last == null;
  }

}