package by.academy.jc.ht.zhabko;

import java.util.ArrayList;
import java.util.Collections;

public class TreesInPark {

  int[] sortByHeight(int[] a) {
    ArrayList<Integer> sortList = new ArrayList<>();
    for (int j : a) {
      if (j != -1) {
        sortList.add(j);
      }
    }
    Collections.sort(sortList);
    for (int i = 0, k = 0; i < a.length; i++) {
        if (a[i] == -1) {
            continue;
        }
      a[i] = sortList.get(k);
      k++;
    }
    return a;
  }
}
