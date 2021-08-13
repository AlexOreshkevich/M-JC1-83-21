package dubautsova;

public class Frog {
    public static void main(String[] args) {
        // Change numbers in the brackets
        System.out.println(solution(1, 31, 10));
    }
    public static int solution(int x, int y, int d) {
        if ((x < y) && (x >= 1) && (x <= 1000000000) && (y <= 1000000000) && (d >= 1) && (d <= 1000000000)) {
           int i;
           for (i = 1; x + d < y; i++) {
               x = x + d;
           }
           return i;
        } else {
            return 0;
        }
    }
}
