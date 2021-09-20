package by.academy.jc.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;
import static by.academy.jc.io.FileSystemUtils.obtainResourcePath;

public class CopyCharacters {

  public static void main(String[] args) throws IOException {

    FileReader inputStream = null;
    FileWriter outputStream = null;

    try {
      inputStream = new FileReader(getResourcePath("xanadu.txt"));
      outputStream = new FileWriter(obtainResourcePath("characteroutput.txt"));

      int c;
      while ((c = inputStream.read()) != -1) {
        outputStream.write(c);
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
