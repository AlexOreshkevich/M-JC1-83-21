package by.academy.jc.akbarova.ht3;

public class Solution {
    public static int solution(int x, int y, int d) {
        if (x < y) {
            double distance = y - x;
            int jumps = (int) Math.ceil(distance / d);
            return jumps;
        } else if (x == y && x != 0) {
            int jumps = 1;
            return jumps;
        } else {
            int jumps = 0;
            return jumps;
        }
    }
}
