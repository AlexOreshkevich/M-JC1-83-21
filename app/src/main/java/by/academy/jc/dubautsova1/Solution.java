package by.academy.jc.dubautsova1;

public class Solution {
    public static int solution(int[] A){
        int a, b, t, n, n1, size;
        size = A.length;
        //buble-sorting
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (A[b - 1] > A[b]) {
                    t = A[b - 1];
                    A[b - 1] = A[b];
                    A[b] = t;
                }
            }

        //algoritm for pozitive numbers
        if (A[0] >= 0) {
            for (n = 0; (n < size - 1) && (A[n] + 1 == A[n + 1]); n++) ;
            return A[n] + 1;

            //algoritm for negative numbers
        } else if (A[size - 1] <= 0) {
            return 1;

            //algoritm for mixed neg and poz numbers
        } else {
            for (n = 0; n < size - 1; n++) {
                if (A[n] > 0) {
                    break;
                }
            }
            if ((A[n] == A[size - 1]) || (A[n] + 1 != A[n + 1])) {
                return A[n] + 1;
            } else {
                for (n1 = n; ((n1 < size - 1) && (A[n1] + 1 == A[n1 + 1])); n1++);
                return A[n1] + 1;
            }
        }
    }
}
