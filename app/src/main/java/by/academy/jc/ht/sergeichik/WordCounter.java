package by.academy.jc.ht.sergeichik;


public class WordCounter {

  public static int words(String inputStr) {
    String str = inputStr.trim();
    String[] line = str.split("\\s+");

    return line.length;
  }
}
