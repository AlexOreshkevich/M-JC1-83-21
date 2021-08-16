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
}
