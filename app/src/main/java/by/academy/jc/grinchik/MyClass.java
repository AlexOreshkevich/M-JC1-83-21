package by.academy.jc.grinchik;

public class MyClass {
    public String getString(String[] args) {
        String version = "App version 1.2.3.4";
        if ((args.length > 0) && (args[0].equals("--version"))) {
            return version;
        } else {
            return "";
        }
    }
    public static void main(String[] args) {
        System.out.println(new MyClass().getString(args));
    }
}
