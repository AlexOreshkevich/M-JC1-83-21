package by.academy.jc;

public class MyClass {

    public static void main(String[] args){
        System.out.println("Hello, World!");
        String message = "something";
        System.out.println(message);

        // optional requirement;
        System.out.println(new MyClass().myMarkForHomework(1));
    }
    // creating a new class method for testing
    public String myMarkForHomework(int n){
        String[] args = {"seven", "eight", "nine", "ten"};
        return args[n+1];
    }
}
