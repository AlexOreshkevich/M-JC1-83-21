package by.academy.jc.zaikouskaya;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnagramUtils {
    public static boolean isAnagram(@NotNull String a, @NotNull String b){

        //checking string lengths
        if (a.length()>50 || b.length()>50)
            throw new IllegalArgumentException("Strings are too long");

        //checking strings for non-alphabetic characters
        Pattern pattern = Pattern.compile("[.[^A-Za-z]]+");
        Matcher matcherA = pattern.matcher(a);
        Matcher matcherB = pattern.matcher(b);

        if (matcherA.find() || matcherB.find())
            throw new IllegalArgumentException("Strings contain not only letters");
        else {
            //convert letters in strings to lowercase
            String aLow = a.toLowerCase();
            String bLow = b.toLowerCase();

            //convert strings to char arrays
            char[] aLowChar = aLow.toCharArray();
            char[] bLowChar = bLow.toCharArray();

            //sort alphabetically
            Arrays.sort(aLowChar);
            Arrays.sort(bLowChar);

            //sorted arrays are converted into strings
            String a2 = Arrays.toString(aLowChar);
            String b2 = Arrays.toString(bLowChar);

            return a2.equals(b2);
        }

    }

}