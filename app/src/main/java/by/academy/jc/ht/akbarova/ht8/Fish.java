package by.academy.jc.ht.akbarova.ht8;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        int counter = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            int fish = A[i];
            int direction = B[i];
            if (direction == 0) {
                boolean survives = true;
                while (!stack.isEmpty()) {
                    int oppositeFish = stack.pop();
                    if (oppositeFish > fish) {
                        stack.push(oppositeFish);
                        survives = false;
                        break;
                    }
                }
                if (survives) {
                    counter++;
                }
            } else {
                stack.push(fish);
            }
        }
        counter += stack.size();
        return counter;
    }
}
