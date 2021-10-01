package by.academy.jc.ht.akbarova.ht9;

public class MyStack<V> {
    private int size;
    private Node head;

    private class Node {
        V v;
        Node next;

        public Node(V v) {
            this.v = v;
        }
    }

    public MyStack() {
        size = 0;
        head = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(V v) {
        Node newNode = new Node(v);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void pop() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    public V peek() {
        if (head == null) return null;
        return head.v;
    }
}
