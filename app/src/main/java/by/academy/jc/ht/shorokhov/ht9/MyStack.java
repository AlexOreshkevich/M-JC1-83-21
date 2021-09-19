package by.academy.jc.ht.shorokhov.ht9;

public class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        } else {
            System.out.println("Pushing new element: " + x);
            arr[++top] = x;
        }
    }
    public int peek() throws Exception {
        if(!isEmpty()){
            return arr[top];
        } else {throw new Exception("Stack is empty");}
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        System.out.println("Removing " + peek());

        return arr[top--];
    }
    public int size(){
        return top + 1;
    }
}
