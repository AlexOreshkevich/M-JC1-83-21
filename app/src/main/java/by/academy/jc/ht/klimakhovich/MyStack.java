package by.academy.jc.ht.klimakhovich;

public class MyStack<T> {

    private final MyLinkList<T> newList = new MyLinkList<>();

    public void push(T element) {
        newList.pushElement(element);
    }

    public T pop() {
        return newList.popElement();
    }

    public T peek() {
        return newList.peekElement();
    }
}
