package by.academy.jc.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;
import static by.academy.jc.io.FileSystemUtils.obtainResourcePath;

/**
 * The CopyLines example invokes BufferedReader.readLine and PrintWriter.println to do input and
 * output one line at a time.
 */
public class CopyLines {

  public static void main(String[] args) throws IOException {

    BufferedReader inputStream = null;
    PrintWriter outputStream = null;

    try {
      inputStream = new BufferedReader(new FileReader(getResourcePath("xanadu.txt")));
      outputStream = new PrintWriter(new FileWriter(obtainResourcePath("characteroutput.txt")));

      String l;
      while ((l = inputStream.readLine()) != null) {
        outputStream.println(l);
      }
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }
      if (outputStream != null) {
        outputStream.close();
      }
    }
  }
}
