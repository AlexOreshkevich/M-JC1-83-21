package by.academy.jc.ht.sergeichik.ht12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;

public class WordSplitter {

    Map<String, Integer> map = new HashMap<>();

    public int frequency(String word) {
        return map.getOrDefault(word, -1);
    }


    public void wordCounter() throws IOException {

        try (Scanner s = new Scanner(new FileInputStream(getResourcePath("sergeichik.data.txt")))) {

            while (s.hasNext()) {
                String word = s.next().toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z]+", "");
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
    }
}