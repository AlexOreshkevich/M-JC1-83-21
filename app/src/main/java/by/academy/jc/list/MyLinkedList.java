package by.academy.jc.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {

    private int size = 0;
    private Item<E> first;
    private Item<E> last;

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class Item<E> {
        E data;
        Item<E> next;

        Item(E element ,Item<E> next) {
            this.data = element;
            this.next = next;
        }

    }

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

    void add(E item) {
        final Item<E> currentLast = last;
        final Item<E> newItem = new Item<E>(item, null);

        last = newItem;

        if (first == null && currentLast == null) {
            first = newItem;
        }
        else {
            currentLast.next = newItem;
        }

        size++;
    }

    int size() {
        return size;
    }

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println("Size = " + list.size());

        for (String item : list) {
            System.out.print(item + " ");
        }

    }
}


