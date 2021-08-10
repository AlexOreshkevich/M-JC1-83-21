
package by.academy.jc.zhabko;

public class MyClass {

  public static void main(String[] args) {

    // Basic example
    System.out.println(new MyClass().getHW());

    // Defining new variable "message"
    String message = "Second example";

    // Sending message to the terminal
    System.out.println(message);

    // To see the result you have to use "javac command" and terminal
    for (String arg : args) {
      System.out.println(arg);
    }
  }
  public String getHW() {return "Hello World!";}
  }

