package by.academy.jc.dubautsova;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        int numberOfSurvFishes = A.length;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < A.length; i++) {
            //a fish flowing downstream
            if (B[i] == 1) {
                stack.push(A[i]);
            }
            //a fish flowing upstream
            if (B[i] == 0) {
                while (!stack.empty()) {
                    if (stack.peek() < A[i]) {
                        stack.pop();
                        numberOfSurvFishes--;
                    }  else {
                        numberOfSurvFishes--;
                        break;
                    }
                }
            }
        }
        return numberOfSurvFishes;
    }
}
