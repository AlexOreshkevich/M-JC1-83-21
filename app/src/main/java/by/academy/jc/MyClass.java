package by.academy.jc;

public class MyClass {
<<<<<<< HEAD

=======
>>>>>>> origin/ht1/SKOPINOV
    public static void main(String[] args){
        System.out.println("Hello, World!");
        String message = "something";
        System.out.println(message);
<<<<<<< HEAD

        // optional requirement;
        System.out.println(new MyClass().myMarkForHomework(1));
    }
    // creating a new class method for testing
    public String myMarkForHomework(int n){
        String[] args = {"seven", "eight", "nine", "ten"};
        return args[n+1];
=======
        for (String arg : args) System.out.println(arg);
>>>>>>> origin/ht1/SKOPINOV
    }
}
