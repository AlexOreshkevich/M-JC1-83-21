package by.academy.jc.ht3_klimakhovich;

public class FrogJump {

    public int frog(int x, int y, int d) {
        //add count of jumps
        int step = 0;
        //check large of jumps
        if (d == 0) {
            System.out.println("large of jumps = 0");
        }
        //check y coordinate
        else if (y == 0) {
            System.out.println("Frog don't need to jump y = 0");
        }
        //check right condition
        else if ((x > y) || (d > y)) {
            System.out.println("Error, please write wrong number");
        }
        //all conditions right
        else if (x < y) {
            for (int i = x; i < y; i += d) {
                step++;
            }
        }

        return step;
    }
}