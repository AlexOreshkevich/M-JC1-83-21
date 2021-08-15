package by.academy.jc.grinchik.ht2;

public class DirtyCalculator extends Calculator {
     public int getSum(int a, int b) {
         return super.getSum(a, b) + a * b;
     }
     public float getSum(float a, float b) {
         return (a + b) + a * b;
     }
     public double getSum(double a, double b) {
         return (a + b) + a * b;
     }
}
