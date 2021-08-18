package by.academy.jc.klimakhovich_ht3;

public class FrogJumper {
    public int frog1(int x, int y, int d) {
        int step = 0;
        int i = x;
        while (i < y) {
            i += d;
            step++;
        }
        return step;
    }

    public int frog2(int x, int y, int d) {
        int step = 0;
        for (int i = x; i <= y; i += d) {
            step++;
        }
        return step;
    }

    public double frog3(int x, int y, int d) {
        double step = 0;
        double path;
        path = (y - x) / d;
        step = path;
        if (path % 1 >= 0) {
            step++;
        }
        return step;
    }
}
