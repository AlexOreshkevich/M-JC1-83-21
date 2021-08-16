package by.academy.jc.klimakhovich_ht3;

public class Solution {
    public int solution1(int x, int y, int d) {
        int step = 0;
        int i = x;
        while (i < y) {
            i += d;
            step++;
        }
        return step;
    }

    public int solution2(int x, int y, int d) {
        int step = 0;
        for (int i = x; i <= y; i += d) {
            step++;
        }
        return step;

    }
}
