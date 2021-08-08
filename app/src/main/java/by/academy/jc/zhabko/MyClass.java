
package by.academy.jc.zhabko;

public class MyClass {

  public static void main(String[] args) {

    // Basic example
    System.out.println("Hello, world!");

    // Defining new variable "message"
    String message = "Second example";

    // Sending message to the terminal
    System.out.println(message);

    // To see the result you have to use "javac command" and terminal
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}

