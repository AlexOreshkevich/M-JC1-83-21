package by.academy.jc.ht.klimakhovich;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


import static by.academy.jc.io.FileSystemUtils.getResourcePath;

public class WordSplitter {


    static List<String> FileReader() throws FileNotFoundException {
        File file = new File(getResourcePath("Klimakhovich.data.txt"));
        ArrayList<String> result = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader(file))) {
            while (s.hasNext()) {
                result.add(s.next().toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z]+", ""));

            }

            s.close();
        }
        return result;
    }


    public static int frequencyWord(List<String> list, String word) throws FileNotFoundException {
        if (list.contains(word)) {
            return Collections.frequency(list, word);
        } else return -1;

    }
}

