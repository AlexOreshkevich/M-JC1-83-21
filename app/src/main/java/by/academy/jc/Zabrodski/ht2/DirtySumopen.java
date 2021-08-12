package by.academy.jc.Zabrodski.ht2;

public class DirtySumopen {

  public static void main(String[] args) {

    System.out.println("Результат = " + result(5, 3));
    System.out.println("Результат = " + result(6L, 1L));
    System.out.println("Результат = " + result(6.3, 1.3));
  }

  // adding the sum of numbers and the product of numbers
  public static int result(int a, int b) {
    return a + b + a * b;
  }

  public static long result(long a, long b) {
    return a + b + a * b;
  }

  public static double result(double a, double b){
    return a + b + a * b;
  }
}