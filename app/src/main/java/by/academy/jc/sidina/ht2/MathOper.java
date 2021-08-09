package by.academy.jc.sidina.ht2;
import java.util.Scanner;

public class MathOper {

  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    int firstN, secondN, result;
    System.out.print("Enter first number: ");
    firstN=number.nextInt();
    System.out.print("Enter second number: ");
    secondN=number.nextInt();
    result=firstN+secondN+firstN*secondN;
    System.out.print("Result is: " + result);
  }

}
