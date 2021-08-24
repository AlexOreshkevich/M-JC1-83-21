package by.academy.jc.Zabrodski.Factorial_Demo;

public class Factorial_Demo {

// N! = N * (N - 1)!

  public static int fact(int N) {
    if (N == 0) {
      return 1;
    }
    if (N == 1) {
      return 1;
    }

    int fact = N;

    for (int i = 1; i < N; i++) {
      fact *= (N - i);
    }
    return fact;
  }


  public static int factRec(int N) {
    if (N == 0) {
      return 1;
    }
    if (N == 1) {
      return 1;
    }
    return N * factRec(N - 1);
  }
}
