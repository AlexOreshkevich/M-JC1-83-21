package by.academy.jc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

  public static void main(String[] args) throws IOException {

    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream(CopyBytes.class.getClassLoader().getResource("xanadu.txt").getFile());
      out = new FileOutputStream("app/src/main/resources/outagain.txt");
      int c;

      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}
