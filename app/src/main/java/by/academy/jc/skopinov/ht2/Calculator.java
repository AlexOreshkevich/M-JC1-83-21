package by.academy.jc.skopinov.ht2;

public class Calculator{
  public static int sum(int a, int b) {
    return (a + b) + a * b;
  }
  public static double sum(double a, double b){
    return (a + b) + a * b;
  }
  public static short sum(short a, short b){
    return (short) ((short) (a + b) + a * b);
  }
  public static byte sum(byte a, byte b){
    return (byte) ((a + b) + a * b);
  }
  public static int sum(int a, int b, int c){
    return (a + b + c) + a * b * c;
  }
}
