package by.academy.jc.dubautsova1;

public class Solution {
    public static int solution(int[] A){
        int a, b, t, n, size;
        size = A.length;
        //bubble sorting
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (A[b - 1] > A[b]) {
                    t = A[b - 1];
                    A[b - 1] = A[b];
                    A[b] = t;
                }
            }

        //algoritm for pozitive numbers starting from 1
        if (A[0] == 1) {
            for (n = 0; (n < size - 1) && (A[n] + 1 == A[n + 1]); n++) ;
            return A[n] + 1;

            //algoritm for negative numbers and pozit. numbers > 1
        } else if ((A[size - 1] <= 0) || (A[0] > 1)) {
            return 1;

            //algoritm for mixed neg and poz numbers
        } else {
            for (n = 0; n < size - 1; n++) {
                if (A[n] > 0) {
                    break;
                }
            }
            // if minimal pozit integer > 1
            if (A[n] > 1) {
                return 1;
            } else {
                // if minimal pozit integer = 1
                for (A[n] = 1; ((n < size - 1) && (A[n] + 1 == A[n + 1])); n++);
                return A[n] + 1;
            }
        }
    }
}
