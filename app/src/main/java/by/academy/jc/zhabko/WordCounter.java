package by.academy.jc.zhabko;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;
import static by.academy.jc.io.FileSystemUtils.obtainResourcePath;

public class WordCounter {

    public static void main(String[] args) throws IOException {
        WordCounter test = new WordCounter();
        test.countWord();
    }



    public void countWord() throws IOException {

        FileReader input = null;
        StringBuilder allText = new StringBuilder();
        Map<String,Integer> frequencyMap = new HashMap<>();

        try {
            input = new FileReader(getResourcePath("xanadu.txt"));

            int c;
            while ((c = input.read()) != -1) {
                allText.append((char) c);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(allText);

        while (matcher.find()) {
            String word = matcher.group();
            if (!frequencyMap.containsKey(word))  {
                frequencyMap.put(word,1);
            } else {
                int freq = frequencyMap.get(word);
                frequencyMap.put(word,freq+1);
            }
        }
        System.out.println(frequencyMap);
    }
}
