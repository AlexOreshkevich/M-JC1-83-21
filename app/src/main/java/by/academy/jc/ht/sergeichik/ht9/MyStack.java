package by.academy.jc.ht.sergeichik.ht9;


    public class MyStack <T> {
        private Node <T> first;
        private int size = 0;

        private static class Node <T>{
            T item;
            Node <T> prev;
            Node <T> next;

            public Node(Node<T> prev, T item, Node<T> next) {
                this.item = item;
                this.prev = prev;
                this.next = next;
            }

        }

        public boolean isEmpty(){
            return first==null;
        }

        public T peek(){
            if (isEmpty())
                throw new NullPointerException("Is empty");
            return first.item;
        }

        private void linkFirst(T t) {
            final Node<T> f = first;
            final Node<T> newNode = new Node<>(null, t, f);
            first = newNode;
            if (f!=null) {
                f.prev = newNode;
            }
            size++;
        }

        public void push (T t){

            linkFirst(t);
        }

        public void  pop(){
            if(isEmpty()){
                throw new NullPointerException("Is empty");
            }
            first = first.next;
        }
    }
