package by.academy.jc.ht.zabrodsky.ht8;

import java.util.Stack;

class Solution {

  public int solution(int[] A, int[] B) {

    int numberOfFish = A.length;
    if (A.length == 0) {
      return 0;
    }

    Stack<Integer> fishStack = new Stack<>();

    for (int i = 0; i < A.length; i++) {

      if (B[i] == 1) {
        fishStack.push(A[i]);
      }
      if (B[i] == 0) {
        while (!fishStack.isEmpty()) {
          if (fishStack.peek() > A[i]) {
            numberOfFish--;
            break;
          } else if (fishStack.peek() < A[i]) {
            fishStack.pop();
            numberOfFish--;
          }
        }

      }
    }
    return numberOfFish;
  }
}
