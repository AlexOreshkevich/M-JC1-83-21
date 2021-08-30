package by.academy.jc.zhabko.ht5;

import java.util.HashMap;

public class AnagramUtils {
    public static boolean isAnagram(String a, String b) {
    String aTech = a.toLowerCase();
    String bTech = b.toLowerCase();

    HashMap<Character, Integer> aMap = new HashMap<>();
    HashMap<Character, Integer> bMap = new HashMap<>();

    for (int i=0; i<aTech.length();i++) {
        if (!aMap.containsKey(aTech.charAt(i))){
            aMap.put(aTech.charAt(i),1);
        } else {
            Integer fr = aMap.get(aTech.charAt(i));
            aMap.put(aTech.charAt(i),++fr);
        }
    }

    for (int i=0; i<bTech.length();i++) {
        if (!bMap.containsKey(bTech.charAt(i))){
            bMap.put(bTech.charAt(i),1);
        } else {
            Integer fr = bMap.get(bTech.charAt(i));
            bMap.put(bTech.charAt(i),++fr);
        }
    }

    return aMap.equals(bMap);
    }
}
