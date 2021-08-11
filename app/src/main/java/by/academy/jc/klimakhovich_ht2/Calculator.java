package by.academy.jc.klimakhovich_ht2;

public class Calculator {
    public double sum(int a, double b) {
        return a + b;
    }

    public double multi(double a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().sum(5, 5.5));
        System.out.println(new Calculator().multi(5.4, 6));
    }
}
