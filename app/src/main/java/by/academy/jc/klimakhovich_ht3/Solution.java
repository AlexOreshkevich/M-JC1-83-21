package by.academy.jc.klimakhovich_ht3;

public class Solution {
    public int solution1(int x, int y, int d) {
        int step = 0;
        while (x < y) {
            x = x + d;
            step++;
        }
        return step;
    }

    public int solution2(int x, int y, int d) {
        int step = 0;
        for (x = 10; x <= y; x += d){
            step++;
        }
        return step;

    }
}
