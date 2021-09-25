package by.academy.jc.zhabko;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;
import static by.academy.jc.io.FileSystemUtils.obtainResourcePath;

public class WordCounter {

    public static void main(String[] args) throws IOException {
        WordCounter test = new WordCounter();
        //test.countWord();
        System.out.println(test.getRootWord("Caresses"));
        System.out.println(test.getRootWord("ponies"));
        System.out.println(test.getRootWord("ties"));
        System.out.println(test.getRootWord("caress"));
        System.out.println(test.getRootWord("cats"));

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
            String word =matcher.group();
            if (!frequencyMap.containsKey(word))  {
                frequencyMap.put(word,1);
            } else {
                int freq = frequencyMap.get(word);
                frequencyMap.put(word,freq+1);
            }
        }
        System.out.println(frequencyMap);
    }

    private boolean isVowel (char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }


    //Porter Stemmer Algorithm
    private String getRootWord(String word) {
        //Step 0
        StringBuilder rootWord = new StringBuilder(word.toLowerCase(Locale.ROOT));
        int m = 0;
        for (int i=0; i<rootWord.length()-1; i++) {
            if (isVowel(rootWord.charAt(i))&&!isVowel(rootWord.charAt(i+1))) {
                m++;
            }
        }


        //Step 1a

        int switcher = 0;

        if (switcher == 0 && (rootWord.subSequence(rootWord.length()-4,rootWord.length()).equals("sses"))) {
            rootWord.delete(rootWord.length()-4,rootWord.length());
            rootWord.append("ss");
            switcher++;
        }

        if (switcher == 0 && (rootWord.subSequence(rootWord.length()-3,rootWord.length()).equals("ies"))) {
            rootWord.delete(rootWord.length()-3,rootWord.length());
            rootWord.append("i");
            switcher++;
        }

        if (switcher == 0 && (rootWord.subSequence(rootWord.length()-2,rootWord.length()).equals("ss"))) {
            rootWord.delete(rootWord.length()-2,rootWord.length());
            rootWord.append("ss");
            switcher++;
        }

        if (switcher == 0 && (rootWord.charAt(rootWord.length()-1)=='s')) {
            rootWord.deleteCharAt(rootWord.length()-1);
            switcher++;
        }

        switcher = 0;






        return rootWord.toString();
    }
}
