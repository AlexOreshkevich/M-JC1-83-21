package by.academy.jc.skopinov.ht4;



import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution4 {
  public static String extractingContent(String s) {
    if (s == null) {
      throw new IllegalArgumentException();
    }
    String result;
    result = firstCheck(s);
    if(!result.equals("None")) {
      result = secondCheck(s);
    }
    return result;
  }

  public static String firstCheck(String s){
    Pattern pattern = Pattern.compile("<[a-zA-Z][.[^<>]]*?>[.[^<]]+?</[a-zA-Z][.[^<>]]*?>");
    Matcher matcher = pattern.matcher(s);
    long count = matcher.results().count();
    if (count == 0) {
      return "None";
    }
    else return "";
  }

  public static String secondCheck(String s){
    String positiveResult = null;

    String tagText;
    String openingTagValue = "";
    String closingTagValue = "";

    Pattern p = Pattern.compile("<[a-zA-Z][.[^<>]]*?>[.[^<]]+?</[a-zA-Z][.[^<>]]*?>");
    Matcher m = p.matcher(s);
    if (m.find()) {
      int start = m.start();
      int end = m.end();
      tagText = s.substring(start, end);

      Pattern openingtag = Pattern.compile("<[a-zA-Z][.[^<>]]*?>");
      Matcher mOpeningtag = openingtag.matcher(tagText);
      if (mOpeningtag.find()) {
        int startOpen = mOpeningtag.start();
        int endOpen = mOpeningtag.end();
        openingTagValue = tagText.substring(startOpen, endOpen);
      }

      Pattern closingtag = Pattern.compile("</[a-zA-Z][.[^<>]]*?>");
      Matcher mClosingtag = closingtag.matcher(tagText);
      if (mClosingtag.find()) {
        int startClose = mClosingtag.start();
        int endClose = mClosingtag.end();
        closingTagValue = tagText.substring(startClose, endClose);
      }

      closingTagValue = closingTagValue.replaceFirst("/", "");

      if (closingTagValue.equals(openingTagValue)) {
        positiveResult = tagText.replaceAll("</?[a-zA-Z][.[^<>]]*?>", "");
      }
      else positiveResult = "None";
    }
    return positiveResult;
  }
}



