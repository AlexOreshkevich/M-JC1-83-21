package by.academy.jc.klimakhovich_ht2;

public class Calculator {
    public double sum1(int a, double b) {
        return a + b + a * b;
    }

    public double sum2(double a, int b) {
        return a + b + a * b;
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().sum1(5, 6.7));
        System.out.println(new Calculator().sum2(3.5, 4));
    }
}