package by.academy.jc.skopinov.ht4;

import java.util.ArrayList;
import java.util.Scanner;

public class DataInput {

  public static void main(String[] args) {
    ArrayList<String> lines = new ArrayList<>();
    int allLinesLength = 0;
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    if (n < 1 || n > 100) {
      throw new IllegalArgumentException();
    }

    for (int i = 0; i <= n; i++) {
      String line = scanner.nextLine();
      allLinesLength += line.length();
      if (line.length() > 10E4)
        throw new IllegalArgumentException();
      lines.add(line);
    }

    if (allLinesLength > 10E6)
      throw new IllegalArgumentException();

    for (int i = 0; i < n; i++) {
      System.out.println(LinesCleaner.extractingContent(lines.get(i)));
    }
  }
}
