package by.academy.jc.ht.akbarova;

public class ArraySumElement {

  public static int sumBetweenMaxMinElement(int[] a) {
    int max = a[0];
    int min = a[0];
    int indexMin = 0;
    int indexMax = 0;
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + ",");
    }

    System.out.println();

    for (int i = 1; i < a.length; i++) {
      if (a[i] < min) {
        indexMin = i;
        min = a[i];
      } else if (a[i] > max) {
        indexMax = i;
        max = a[i];
      }
    }

    System.out.println(min + " " + max);

    for (int i = Math.min(indexMin, indexMax) + 1; i < Math.max(indexMin, indexMax); i++) {
      sum += a[i];
    }

    System.out.println(sum);

    return sum;
  }
}
