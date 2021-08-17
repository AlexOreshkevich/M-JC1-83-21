package by.academy.jc.akbarova;

public class MyClass {
    public static void main (String[] args){
        String message="Smile and be happy ;)";
        System.out.println("Hello, world!");
        System.out.println(message);
        System.out.println(new MyClass().getMessage());
    }
    public String getMessage(){
        return "Hi for everyone!";
    }
}