package by.academy.jc.ht.sergeichik.ht8;


import java.util.HashSet;
import java.util.Stack;

class Solution {
    public int solution(int[] A, int[] B) {
        int number = A.length;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                while (!stack.empty()) {
                    int size = stack.peek();
                    if (size > A[i]) {
                        number--;
                        break;
                    }
                    if (size < A[i]) {
                        stack.pop();
                        number--;
                    }
                }
            } else if (B[i] == 1) {
                stack.push(A[i]);
            }
        }
        return number;
    }
}



