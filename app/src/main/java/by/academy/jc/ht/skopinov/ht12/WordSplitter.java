package by.academy.jc.ht.skopinov.ht12;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WordSplitter {

  Map<String, Integer> map = new HashMap<>();
  int maxFrequency = 0;
  List<String> maxFrequencyWords = new ArrayList<>();

  void gettingWords(String resourceName) throws IOException{

    try (Scanner s = new Scanner(
        new BufferedReader(new FileReader(getResourcePath(resourceName))))) {
      Pattern p = Pattern.compile("[^a-zA-Z]+");
      s.useDelimiter(p);

      while (s.hasNext()) {
        String word = s.next().toLowerCase();
        if (map.containsKey(word)) {
          int n = map.get(word) + 1;
          map.put(word, n);
        } else {
          map.put(word, 1);
        }
      }
    }
  }

  int frequency(String word){
    int amount = -1;

    for (Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      if (word.equalsIgnoreCase(key)) {
        amount = value;
        break;
      }
    }
    return amount;
  }

  void getMaxFrequency(){
    for (Entry<String, Integer> entry : map.entrySet()) {
      int value = entry.getValue();
      if (value > maxFrequency) {
        maxFrequency = value;
      }
    }
    for (Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      if (value == maxFrequency) {
        maxFrequencyWords.add(key);
      }
    }
    System.out.println("The most common words are: " + maxFrequencyWords);
    System.out.println("The maximum frequency is: " + maxFrequency);
  }
}
