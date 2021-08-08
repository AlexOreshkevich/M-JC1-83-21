package by.academy.jc;
public class MyClass {
    public static void main(String[] args) {
        if(args.length > 1)
            System.out.println(args[1]);
        String message1 = "Java ";
        String message2 = "rules ";
        String message3 = "the world!";
        System.out.println("I think, that " + message1 + message2 + message3);
    }
}
