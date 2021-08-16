package by.academy.jc;

public class Main {
    public static void main(String[] args) {
        //test int
        Sum sumtest = new Sum();
        System.out.println("sum int: " + sumtest.sum(5, 5));
        //test double
        double a1 = 4.3;
        double b1 = 3.3;
        System.out.println("sum double: " + sumtest.sum(a1, b1));
    }
}
