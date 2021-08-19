package dubautsova;

public class Frog {
    public static int solution(int x, int y, int d) {
        if ((x < y) && (x >= 1) && (x <= 1000000000) && (y <= 1000000000) && (d >= 1) && (d <= 1000000000)) {
           return (int) Math.ceil((double)(y - x) / d);
        } else {
            return 0;
        }
    }
}
