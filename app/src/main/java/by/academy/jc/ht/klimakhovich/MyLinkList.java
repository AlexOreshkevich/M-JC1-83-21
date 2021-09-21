package by.academy.jc.ht.klimakhovich;


public class MyLinkList<T> {


    private class Item<T> {
         T element;
         Item<T> next;


        Item(T element) {
            this.element = element;

        }
    }


    private Item<T> first;

    public boolean isEmpty(){
        return first==null;
    }

    public void pushElement(T element) {
        Item<T> f = new Item<T>(element);
        f.next = first;
        first = f;
    }

    public T popElement(){
        if (isEmpty()){
            throw new NullPointerException("empty");
        }
        Item<T> prevElement = first;
        first = first.next;
        return prevElement.element;
    }

    public T peekElement() {
        if (isEmpty()) {
            throw new NullPointerException("empty");
        }
        Item<T> lastElement = first;
        return lastElement.element;
    }


}

