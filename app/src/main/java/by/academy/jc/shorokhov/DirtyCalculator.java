package by.academy.jc.shorokhov;

public class Dirtycalculator {
    public static void  main(String[] args) {

        System.out.println("Sum is equal " + new Dirtycalculator().sum(1.5,4)); // sum is equal to 3
        System.out.println("Sum is equal " + new Dirtycalculator().sum(2.5,3)); // sum is equal to 5
        System.out.println();
        System.out.println("Sub is equal " + new Dirtycalculator().sub(1.5,4)); // sub is equal to -2.5
        System.out.println("Sub is equal " + new Dirtycalculator().sub(2.5,3)); // sub is equal to -0.5

    }
        public static double sum(double a, int b) {

        return a+b;
    }

    public static double sub(double a, int b) {
        return a-b;
        }
}
