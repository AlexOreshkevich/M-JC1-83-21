package by.academy.jc.ht.grinchik;

public class MyClass {

  public static String version() {
    return "App version 1.2.3.4";
  }

  public static void main(String[] args) {
    System.out.println(new MyClass().getString(args));
  }

  public String getString(String[] args) {
    if ((args.length > 0) && (args[0].equals("--version"))) {
      return MyClass.version();
    } else {
      return "";
    }
  }
}
