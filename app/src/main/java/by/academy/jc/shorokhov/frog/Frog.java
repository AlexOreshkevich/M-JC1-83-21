package by.academy.jc.shorokhov.frog;

public class Frog {

    public int solution(int x, int y, int d) {
        int jump = 0;
        int i = x;
        for ( i = x; i < y; i = i + d ) {
            if (x > 1000000000 || y > 1000000000) {
                boolean bigger = x <= y;
            }
            jump++;
        }
        return jump;
    }
}


