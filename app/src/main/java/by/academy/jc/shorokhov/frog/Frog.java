package by.academy.jc.shorokhov.frog;

public class Frog {
    public int solution(int x, int y, int d) {
    int jump = 0;
    while (x <= y) {
        x += d;
        jump++;
    }
    return jump;


    }
    public int solution1(int x, int y, int d) {
        int jump = 0;
        for ( jump = 0; x <= y; jump++ ) {
            x += d;
        }
        return jump;
    }
}
