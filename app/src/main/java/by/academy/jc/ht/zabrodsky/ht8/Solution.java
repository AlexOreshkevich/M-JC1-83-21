package by.academy.jc.ht.zabrodsky.ht8;

import java.util.Stack;

class Solution {

  private int size;
  private int direction;
  private static final int UPSTREAM = 0;
  private static final int DOWNSTREAM = 1;

  public Solution() {

  }

  public Solution(int size, int direction) {
    this.size = size;
    this.direction = direction;
  }

  public int solution(int[] A, int[] B) {

    if (A.length == 0) {
      return 0;
    }

    Stack<Solution> fishStack = new Stack<>();

    for (int i = 0; i < A.length; i++) {
      Solution currentFish = new Solution(A[i], B[i]);
      boolean currentFishIsAlive = true;

      if (fishStack.isEmpty()) {
        fishStack.push(currentFish);
      } else {
        Solution previousFish = fishStack.peek();
        if (previousFish.direction == DOWNSTREAM && currentFish.direction == UPSTREAM) {
          while (!fishStack.isEmpty() && fishStack.peek().direction != currentFish.direction) {
            if (previousFish.size < currentFish.size) {
              previousFish = fishStack.pop();
            } else {
              currentFishIsAlive = false;
              break;
            }
          }

          if (currentFishIsAlive) {
            fishStack.push(currentFish);
          }

        } else {
          fishStack.push(currentFish);
        }
      }
    }

    return fishStack.size();

  }
}