package by.academy.jc.zaikouskaya;

public class Solution {
    public int solution(int x, int y, int d) {

        //calculating jumps
        int jumps = (y - x)/d;

        //calculating remainder of the division
        int remainder = (y - x) % d;

        //checking remainder of the division
        if (remainder != 0) {
            jumps++;
            }
        return jumps;
    }
}
