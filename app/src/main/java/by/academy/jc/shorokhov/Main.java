package by.academy.jc.shorokhov;

public class Main {

    public static void main(String[] args) {
        Dirty calculator = new Dirty();

        int a = 10;
        int b = 5;
        double c = 6.5;
        double d = 3.5;

        System.out.println(calculator.sum(a,b));
        System.out.println(calculator.sub(c,d));
         }
}
