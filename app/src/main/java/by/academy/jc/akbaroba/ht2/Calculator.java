package by.academy.jc.akbaroba.ht2;

public class Calculator {

    public static int sumAndMultiply(int a, int b) {
        int result = a + b + a * b;
        return result;
    }

    public static int sumAndMultiply(int a, int b, int c) {
        int result = a + b + c + a * b * c;
        return result;
    }
}
