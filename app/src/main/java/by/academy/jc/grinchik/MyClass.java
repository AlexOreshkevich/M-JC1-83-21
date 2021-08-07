package by.academy.jc.grinchik;

public class MyClass {
    public static void main(String[] args) {
        String message = "something";
        String version = "1.2.3.4";
        System.out.println(message);
        if ((args.length > 0) && (args[0].equals("--version"))) {
            System.out.println(version);
        }
    }
}
