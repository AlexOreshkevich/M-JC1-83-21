package by.academy.jc.ht.dubautsova;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;

public class WordSplitter {

   Map<String, Integer> wordCounter = new HashMap<>();


   void getWordsFromText(String file) throws IOException {
        Scanner scan = new Scanner(new FileReader(getResourcePath(file)));

            while (scan.hasNext()) {
                String word = scan.next().toLowerCase().replaceAll("[\\.,[ - ]'?\";!]","");
                if (wordCounter.containsKey(word)) {
                    int counter = wordCounter.get(word) + 1;
                    wordCounter.put(word, counter);
                } else {
                    wordCounter.put(word, 1);
                }
            }
        scan.close();

   }

    int getFrequency(String word){
        return wordCounter.getOrDefault(word,-1);
    }

    Entry<String, Integer> getWordWithMaxFrequency() {
        Entry<String, Integer> maxEntry= null;
        for (Entry<String, Integer> entry : wordCounter.entrySet()){
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }
}
