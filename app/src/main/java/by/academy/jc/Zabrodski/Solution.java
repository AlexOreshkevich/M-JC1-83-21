package by.academy.jc.Zabrodski;

class Solution {

  /**
   * @param x - position before jumping
   * @param y - position after jumping
   * @param d - jump length
   * @return  - returns the minimum number of jumps
   */
  public int solution1(int x, int y, int d){
    int count = 0;

    while (x<y){
      x+=d;
      count++;
    }

    return count;
  }

  public int solution2(int x, int y, int d){
    int count = 0;

    if (((y - x) % d) > 0) {
      double tpm = (y - x) / d;
      count = (int) tpm;
      count++;
    }
    else if (((y - x) % d) == 0){
      count = (y - x) / d;
    }

    return count;
  }
}