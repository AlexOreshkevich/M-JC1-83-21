package by.academy.jc.example;

import com.google.common.base.MoreObjects;

public class Circle {

    private double a;
    private double b;

    public Circle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("a", a)
                .add("b", b)
                .toString();
    }
}
