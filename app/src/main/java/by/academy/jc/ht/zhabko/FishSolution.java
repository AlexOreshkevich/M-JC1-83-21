package by.academy.jc.ht.zhabko;

import java.util.Stack;

public class FishSolution {

    public int solution (int[] A, int[] B) {
        int counter = A.length;
        Stack <Integer> fishStack = new Stack();
        for (int i=0; i<A.length; i++) {
            if (B[i]==1) {
                fishStack.push(A[i]);
            }
            if (B[i]==0) {
                while (!fishStack.empty()) {
                    if (fishStack.peek()>A[i]) {
                        counter--;
                        break;
                    }
                    if (fishStack.peek()<A[i]) {
                        fishStack.pop();
                        counter--;
                    }
                }
            }

        }
        return counter;
    }

}
