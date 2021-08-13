package by.academy.jc.klimakhovich_ht2;

public class DirtyCalculator {
    public double sum1(double a, double b) {
        return a + b + a * b;
    }

    public double sum2(double a, int b) {
        return a + b + a * b;
    }
    public double sum(){
        double x = 3;
        double y = 2;
        double usualSum = new Calculator().getSum(x,y);
        double usualMultiple = new Calculator().getMultiple(x,y);
        return usualSum + usualMultiple;
    }
}
