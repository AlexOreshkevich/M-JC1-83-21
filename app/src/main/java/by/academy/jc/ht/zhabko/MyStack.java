package by.academy.jc.ht.zhabko;


public class MyStack <E> {

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

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
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

   E peek() {
       if (first==null)
           throw new  RuntimeException("Current MyStack is empty");
        return first.item;
    }

    void push (E e) {
        linkFirst(e);
    }

    void pop() {
        if (first==null)
            throw new  RuntimeException("Current MyStack is empty");
        first=first.next;
    }
}
