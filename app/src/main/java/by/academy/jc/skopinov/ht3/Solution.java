package by.academy.jc.skopinov.ht3;

class Solution {

  public int solution(int x, int y, int d){
    int distance = y - x;
    if (x <= 0 || y<= 0 || x > 1000000000 || y > 1000000000 || d > 1000000000)
      throw new IllegalArgumentException("parameter values don't correspond to the task condition");
    else if (d <= 0)
      throw new IllegalArgumentException("the small frog jumps backward or upward and never reaches the goal");
    else if (x >= y)
      return 0;
    else if (distance % d == 0)
      return distance / d;
    else return distance / d + 1;
  }
}

