package by.academy.jc.ht.korolyova.calculator;

public class DirtyCalculator extends Calculator1 {

  public int sum1(int a, int b) {
    int c = a + b;
    return c + a * b;
  }

  public float sum1(float a, float b) {
    float c = a + b;
    return c + a * b;
  }

  public double sum1(double a, double b) {
    double c = a + b;
    return c + a * b;
  }
}



