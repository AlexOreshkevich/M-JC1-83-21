package by.academy.jc.ht.zhabko;


import java.util.*;

public class MyStack <E> implements List {

    private Node <E> first;
    private int size;

    private static class Node <E> {
        E item;
        Node <E> prev;
        Node <E> next;

        Node (Node <E> prev, E element, Node <E> next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }
    }


    @Override
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {

        for (Node <E> x = first; x!=null; x = x.next){
            if (o == null & x.item == null) {
                return true;
            }
            if (x.item == null) continue;
            if (o !=null & x.item.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator <E> {

        int currentIndex = 0;

        Node <E> currentNode = first;

        @Override
        public boolean hasNext() {
            return currentIndex != size;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            currentIndex++;

            if (currentNode.next == null) {
                return currentNode.item;
            } else {
                currentNode = currentNode.next;
            }
            return currentNode.prev.item;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        int counter = 0;
        for (Node <E> x = first; x!=null; x = x.next) {
            objects[counter] = x.item;
            counter++;
        }
        return objects;
    }

    @Override
    public boolean add(Object o) {
        push((E) o);
        return peek()==o ? true : false;
    }

    @Override
    public boolean remove(Object o) {

        Node <E> nextLink;
        Node <E> prevLink;

        for (Node <E> x = first; x!=null; x = x.next){
            if (o == null & x.item == null) {
                prevLink = x.prev;
                nextLink = x.next;
                x.prev.next = nextLink;
                x.next.prev = prevLink;
                return true;
            }
            if (x.item == null) continue;
            if (o !=null & x.item.equals(o)) {
                prevLink = x.prev;
                nextLink = x.next;
                x.prev.next = nextLink;
                x.next.prev = prevLink;
                return true;
            }
        }

        return false;
    }



    @Override
    public void clear() {
        for (Node <E> x = first; x!=null; x = x.next){
            pop();
            size--;
        }

    }

    @Override
    public Object get(int index) {

        if (index >= size) {
            throw new RuntimeException("Index out of range");
        }

        int counter = 0;
        Node <E> found = null;

        for (Node <E> x = first; x!=null; x = x.next){
            if (counter == index) {
                found = x;
                break;
            }
            counter++;
        }

        return found.item;
    }

    @Override
    public Object set(int index, Object element) {
        Node <E> found = null;
        if (index >= size) {
            throw new RuntimeException("Index out of range");
        }

        int counter = 0;


        for (Node <E> x = first; x!=null; x = x.next){
            if (counter == index) {
                found = new Node<>(x.prev,x.item,x.next);
                x.item = (E) element;
                break;
            }
            counter++;
        }

        return found.item;
    }

    @Override
    public void add(int index, Object element) {

        if (index >= size) {
            throw new RuntimeException("Index out of range");
        }

        int counter = 0;


        for (Node <E> x = first; x!=null; x = x.next){
            if (counter == index) {

                Node <E> newNode = new Node<>(x.prev, (E) element,x);

                x.prev.next = newNode;
                x.prev = newNode;

                size++;
                break;
            }
            counter++;
        }

    }

    @Override
    public Object remove(int index) {

        if (index >= size) {
            throw new RuntimeException("Index out of range");
        }

        int counter = 0;
        E found = null;


        for (Node <E> x = first; x!=null; x = x.next) {
            if (counter == index) {

                x.prev.next = x.next;
                x.next.prev = x.prev;

                found = x.item;
                size--;
            }
        }

        return found;
    }

    @Override
    public int indexOf(Object o) {
        int counter = 0;

        for (Node <E> x = first; x!=null; x = x.next){
            if (o == null & x.item == null) {
                return counter;
            }
            if (x.item == null) {
                counter++;
                continue;
            };
            if (o !=null & x.item.equals(o)) {
                return counter;
            }
            counter++;
        }

        return -1;
    }




    private void linkFirst(E e) {
        final Node<E> f = first;
        final Node <E> newNode = new Node<>(null,e,f);
        first = newNode;
        if (f!=null) {
            f.prev = newNode;
        }
        size++;
    }

   E peek() throws RuntimeException {
       if (first==null)
           throw new  RuntimeException("Current MyStack is empty");
        return first.item;
    }

    void push (E e) {
        linkFirst(e);
    }

    void pop() throws RuntimeException {
        if (first==null)
            throw new RuntimeException("Current MyStack is empty");
        first=first.next;
    }




    //Not implemented
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

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
}
