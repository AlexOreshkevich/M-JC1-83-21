package by.academy.jc.ht.shorokhov.ht9;

public class MyStack<E> {

    private Node head = null;
    private int size;



    private class Node<E> {
        private E element;
        private Node<E> next;




        public Node(E element) {
            this.element = element;
        }
    }


    public MyStack(){
        head = null;
        size = 0;
    }


    public void push(E element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
        size++;

    }


    public void pop() throws Exception {
        if(head == null) throw new Exception("Stack is empty");
        head = head.next;
        size--;
    }

    public E peek() throws Exception {
        if(head == null) throw new Exception("Stack is empty");
        Node<E> prev = head;
        return prev.element;
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
