package by.academy.jc.ht.shorokhov.ht12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static by.academy.jc.io.FileSystemUtils.getResourcePath;


public class WordSplitter {


    public static void main(String args[]) throws IOException {
        System.out.println(frequency(ListReader(),"tom"));

        }


    static List<String> ListReader() throws FileNotFoundException {
        File file = new File(getResourcePath("input1.txt"));
        ArrayList<String> result = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader(file))) {
            while (s.hasNext()) {
                result.add(s.next().toLowerCase(Locale.ROOT).replaceAll("[\\.,[ - ]'?\";!]", ""));

            }

            s.close();
        }
        return result;
    }


    public static int frequency(List<String> list, String word) throws FileNotFoundException {
        if (list.contains(word)) {
            return Collections.frequency(list, word);
        } else return -1;

    }
    }


