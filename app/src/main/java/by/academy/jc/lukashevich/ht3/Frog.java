package by.academy.jc.lukashevich.ht3;

public class Frog {

  public int jump(int x, int y, int d) {

    //number of jumps
    int n = 0;

    if ((x >= 0) && (x < y)) {
      for (int i = x; i < y; i = i + d) {
        n++;
      }
    } else {
      System.out.println("error");
    }

    return n;
  }
}
