package by.academy.jc.shorokhov;

public class DirtyCalculator {
    public static void  main(String[] args) {
        double x = sum(1.5, 4);
        double y = sum(2.5, 3);
        System.out.println("Sum is equal " + 5.5); // sum is equal to 3
        System.out.println("Sum is equal " + 5.5); // sum is equal to 5
        System.out.println();
        System.out.println("Sub is equal " + -2.5); // sub is equal to -2.5
        System.out.println("Sub is equal " + -0.5); // sub is equal to -0.5

    }
        public static double sum(double a, int b) {

        return a+b;
    }

    public static double sub(double a, int b) {
        return a-b;
        }
}
