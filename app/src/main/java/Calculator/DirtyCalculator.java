package Calculator;

public class DirtyCalculator extends Calculator1 {
    public int Sum1(int a, int b) {
        int c = a + b;
        return c + a * b;
    }

    public float Sum1(float a, float b) {
        float c = a + b;
        return c + a * b;
    }

    public long Sum1(long a, long b) {
        long c = a + b;
        return c + a * b;
    }
    public double Sum1(double a, double b) {
        double c = a + b;
        return c + a * b;
    }
}



