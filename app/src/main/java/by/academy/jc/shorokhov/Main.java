package by.academy.jc.shorokhov;

public class Main {

    public static void main(String[] args) {
        Dirtycalculator calculator = new Dirtycalculator();

        int a = 10;
        int b = 5;
        double c = 5.5;

        System.out.println(calculator.sum(a,b));
        System.out.println(calculator.sub(a,c));
         }
}
