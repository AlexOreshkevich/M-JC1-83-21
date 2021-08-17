package by.academy.jc.zhabko.ht3;

public class Solution {

//Basic solution. Uses while loop
    public int solution (int x,int y,int d) {
    int steps = 0;
    int currentPosition = x;
    while (currentPosition < y) {
        steps++;
        currentPosition += d;
    }
    return steps;
    }

//More efficient solution. Uses mathematics method
//If stepsFraction = 0, frog is on the destination point
//If stepsFraction != 0, frog have to make one more step
    public int solutionSmart (int x,int y, int d) {
        int stepsWhole = (y - x) / d;
        int stepsFraction = (y - x) % d;
        if (stepsFraction != 0) return stepsWhole+1;
        else return  stepsWhole;
    }
}
