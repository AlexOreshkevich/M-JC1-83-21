package by.academy.jc.akbarova.prime_number;

public class Prime {
    public static int isPrime(int a, int b) {
        int count = 0;
        int numberIsPrime = 0;
        for (int i = a; i <= b; i++) {
            numberIsPrime = 0;
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                numberIsPrime = i;
                count++;
            }
            if (count == 2) {
                System.out.println(numberIsPrime);
                break;
            }
        }
        return numberIsPrime;
    }
}