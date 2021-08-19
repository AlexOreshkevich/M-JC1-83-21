package by.academy.jc.Zabrodski;

public class TagContentExtractor {

  public String extractTextFromTags(String line) {

    for (int i = 0; i < line.toCharArray().length - 1; i++) {
      int numberBracketL = line.indexOf('<');
      int numberBracketR = line.indexOf('>');
      String tag1 = line.substring(numberBracketL + 1, numberBracketR);
      if ((line.toCharArray()[i] == '<') && (line.toCharArray()[i + tag1.length() + 1] == '>')) {
        line = line.substring(numberBracketR + 1);
        numberBracketL = line.indexOf('<');
        numberBracketR = line.indexOf('>');
        if ((line.toCharArray()[numberBracketL + 1] == '/') &&
            (tag1.equals(line.substring(numberBracketL + 2, numberBracketR)))) {
          return line.substring(0, numberBracketL);
        }
        else {
          line = line.substring(numberBracketR+1);
          continue;
        }
      }
    }
    return "None";
  }
}
