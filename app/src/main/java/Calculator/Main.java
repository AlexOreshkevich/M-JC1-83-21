package Calculator;

public class Main {
    public static void main(String[] args) {
        DirtyCalculator Calculator = new DirtyCalculator();
        System.out.println("Your first result is"+" "+Calculator.Sum1(5, 4));
        System.out.println("Your second result is"+" "+Calculator.Sum1(31.24f, 44.03f));
        System.out.println("Your third result is"+" "+Calculator.Sum1(42949, 42949));
        System.out.println("Your fourth result is"+" "+Calculator.Sum1(5.7, 4.7));
            }
}
