package by.academy.jc.ht.sergeichik;

public class NumberSolitaire {

    public static int solution(int A[]){

        int number[] = new int [A.length];
        number[0] = A[0];

        for(int i = 1; i < number.length;i++){
            number[i] = Integer.MIN_VALUE;

            for(int j = 1; j<=6 && i-j >= 0; j++){
                number[i]= Math.max(number[i], number[i-j]);
                }
            number[i] += A[i];
            }
        return number[number.length - 1];
    }
}
