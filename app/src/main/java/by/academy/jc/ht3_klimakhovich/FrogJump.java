package by.academy.jc.ht3_klimakhovich;

public class FrogJump {

    public int frog(int x, int y, int d) {
        int step = 0;
        if (d == 0) {
            System.out.println("large of jumps = 0");
            x = 0;
            y = 0;
        } else if (y == 0) {
            System.out.println("Frog don't need to jump y = 0");
        } else if ((x > y) || (d > y)) {
            System.out.println("Error, please write wrong number");
        } else if (x < y) {
            for (int i = x; i < y; i += d) {
                step++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(new FrogJump().frog(10, 20, 30));
    }
}