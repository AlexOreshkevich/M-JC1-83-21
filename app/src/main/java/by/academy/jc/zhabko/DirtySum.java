package by.academy.jc.zhabko;

public class DirtySum {

    //Basic hometask
    public int sum(int a, int b) {
        return (a + b + a * b);
    }

    //Method overloading
    //Float type
    public float sum(float a, float b) {
        return (a + b + a * b);
    }

    //Double type
    public double sum(double a, double b) {
        return (a + b + a * b);
    }

    //Short type (why IDEA don't permit to use public short method???)
    public int sum(short a, short b) {
        return (a + b + a * b);
    }

    //Long type
    public long sum(long a, long b) {
        return (a + b + a * b);
    }

    //byte type (why IDEA don't permit to use public byte method???)
    public int sum(byte a, byte b) {
        return (a + b + a * b);
    }

    public double division (double a, double b) {
        return (a/b);
    }

}



