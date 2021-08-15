package by.academy.jc.Zabrodski;

class Solution {
  private int x;
  private int y;
  private int d;

  public void setXYD(int x, int y, int d){
    if (x <= y)
      this.x = x;
    else
      System.out.println("");

  }

  public int getXYD(){
    return x;
  }

  /**
   * @param x - position before jumping
   * @param y - position after jumping
   * @param d - jump length
   * @return  - returns the minimum number of jumps
   */
  public int solution(int x, int y, int d){
    int count = 0;

    while (x<y){
      x+=d;
      count++;
    }

    return count;
  }
}