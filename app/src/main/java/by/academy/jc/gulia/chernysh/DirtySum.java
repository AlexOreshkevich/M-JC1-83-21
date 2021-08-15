package by.academy.jc.gulia.chernysh;

public class DirtySum {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int c = x + y;
        int d = x * y;
        int e = x * y + c;
        System.out.println(c); // Print the sum of x + y
        System.out.println(d); // Print the product of x * y
        System.out.println(e); // Print the product of x * y + x + y
    }
    public static char returnLetter() {
        return ('x');
    }
}
