package by.academy.jc.dubautsova;

import java.util.*;
//I tried to implement java.util.List interface, but unit-tests were failed.
//I've commented my attempt to avoid the error and decided to provide you an alternative solution

public class MyStack<T> {

        public static class Item<T> {

            private T data;
            private Item<T> next;

            public Item(T data) {
                this.data = data;
            }
        }

        private Item<T> first = null;


    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException("MyStack is empty");
        }
        Item<T> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    public void push(T data) {
        Item<T> newFirst = new Item<T>(data);
        newFirst.next = first;
        first = newFirst;
        }


        public T peek() {
            if (isEmpty()) {
                throw new NullPointerException("MyStack is empty");
            }
            Item<T> oldFirst = first;
            return oldFirst.data;
        }

        public boolean isEmpty() {
            return first == null;
        }
    }

/*public class MyStack<E> implements List {
    private int size = 0;
    private Item<E> first;
    private Item<E> last;

    private class Item<E> {
        E data;
        Item<E> next;

        Item(E element ,Item<E> next) {
            this.data = element;
            this.next = next;
        }

        public Item(E data) {
        }
    }

    public void push(E data) {
        Item<E> newFirst = new Item<E>(data);
        newFirst.next = first;
        first = newFirst;
    }


    public E pop() {
        if (isEmpty()) {
            throw new NullPointerException("MyStack is empty");
        }
        Item<E> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    public E peek() {
        if (isEmpty()) {
            throw new NullPointerException("MyStack is empty");
        }
        Item<E> oldFirst = first;
        return oldFirst.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        class MyIterator implements Iterator<E> {

            private Item<E> current;
            private int nextIndex;
            private Item<E> lastReturned;

            MyIterator() {
                current = first;
                nextIndex = 0;
            }

            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext())
                    throw new NoSuchElementException();

                lastReturned = current;
                current = current.next;
                nextIndex++;
                return lastReturned.data;
            }
        }
    return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
*/
