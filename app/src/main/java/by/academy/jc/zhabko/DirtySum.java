package by.academy.jc.zhabko;

public class DirtySum {

    //Basic hometask
    public int DirtySumMethod(int a, int b) {
        return (a + b + a * b);
    }

    //Method overloading
    //Float type
    public float DirtySumMethod(float a, float b) {
        return (a + b + a * b);
    }

    //Double type
    public double DirtySumMethod(double a, double b) {
        return (a + b + a * b);
    }

    //Short type (why IDEA don't permit to use public short method???)
    public int DirtySumMethod(short a, short b) {
        return (a + b + a * b);
    }

    //Long type
    public long DirtySumMethod(long a, long b) {
        return (a + b + a * b);
    }

    //byte type (why IDEA don't permit to use public byte method???)
    public int DirtySumMethod(byte a, byte b) {
        return (a + b + a * b);
    }

    public double DivisionMethod(double a, double b) {
        return (a/b);
    }





}



