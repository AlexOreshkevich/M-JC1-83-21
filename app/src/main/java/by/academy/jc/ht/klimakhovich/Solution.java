package by.academy.jc.ht.klimakhovich;

import java.util.Stack;

public class Solution {


    public int solution(int[] A, int[] B) {

        int fishCounter = A.length;

        if (A.length <= 1 || A.length >= 100000 || A.length != B.length) {
            throw new IllegalArgumentException("Please, write correct number!");
        }
        for (int k : A) {
            if (k <= 0 || k >= 1000000000) {
                throw new IllegalArgumentException("Please, write correct number!");
            }
        }
        for (int k : B) {
            if (k != 0 && k != 1) {
                throw new IllegalArgumentException("Please, write correct number!");
            }
        }

        Stack<Integer> fish = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            if (B[i] == 1) {
                fish.push(A[i]);
            }
            if (B[i] == 0) {
                while (!fish.isEmpty()) {
                    if (fish.peek() > A[i]) {
                        fishCounter--;
                        break;
                    } else if (fish.peek() < A[i]) {
                        fish.pop();
                        fishCounter--;
                    }
                }
            }

        }
        return fishCounter;
    }

}

