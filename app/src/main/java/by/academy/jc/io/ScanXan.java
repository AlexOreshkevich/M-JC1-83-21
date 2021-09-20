package by.academy.jc.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * reads the individual words in xanadu.txt and prints them out, one per line
 */
public class ScanXan {

  public static void main(String[] args) throws IOException {

    Scanner s = null;

    try {
      s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

      while (s.hasNext()) {
        System.out.println(s.next());
      }
    } finally {
      if (s != null) {
        s.close();
      }
    }
  }
}
