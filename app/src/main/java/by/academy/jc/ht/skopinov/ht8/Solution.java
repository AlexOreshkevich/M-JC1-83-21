package by.academy.jc.ht.skopinov.ht8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  public int solution(int[] A, int[] B){
    // N is an integer within the range [1..100,000]
    if (A.length < 1 || A.length > 100000 || A.length != B.length) {
      throw new IllegalArgumentException();
    }
    // each element of array A is an integer within the range [0..1,000,000,000]
    for (int i : A) {
      if (i < 0 || i > 1000000000) {
        throw new IllegalArgumentException();
      }
    }
    // each element of array B is an integer that can have one of the following values: 0, 1
    for (int i : B) {
      if (i != 0 && i != 1) {
        throw new IllegalArgumentException();
      }
    }

    Map<Integer, Integer> fishes = new LinkedHashMap<>();
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
      fishes.put(A[i], B[i]);
      a.add(A[i]);
      b.add(B[i]);
    }
    // the elements of A are all distinct
    if (fishes.size() != A.length) {
      throw new IllegalArgumentException();
    }

    boolean conflict = true;
    while (conflict) {
      for (int i = 0; i < (fishes.size() - 1); i++) {
        if (b.get(i) == 1 && b.get(i + 1) == 0) {
          if (a.get(i) > a.get(i + 1)) {
            fishes.remove(a.get(i + 1));
            a.remove(i + 1);
            b.remove(i + 1);
          }
          else {
            fishes.remove(a.get(i));
            a.remove(i);
            b.remove(i);
          }
        }
      }
      conflict = false;
      for (int j = 0; j < (fishes.size() - 1); j++) {
        if (b.get(j) == 1 && b.get(j + 1) == 0) {
          conflict = true;
          break;
        }
      }
    }
    return fishes.size();
  }
}


