package by.academy.jc.klimakhovich_ht3;

public class FrogJumper {

    public double frog(int x, int y, int d) {
        double step = 0;
        double path;
        path = (y - x) / d;
        step = path;
        if (path % 1 >= 0) {
            step++;
        }
        return step;
    }
    public static void main(String[] args){
        System.out.println(new FrogJumper().frog(10,85,30));
    }
}