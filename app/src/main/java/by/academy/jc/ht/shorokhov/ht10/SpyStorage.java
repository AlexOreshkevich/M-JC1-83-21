package by.academy.jc.ht.shorokhov.ht10;

import java.util.HashMap;

public class SpyStorage {


    static HashMap<String, Integer> spy = new HashMap<>();


    public static void setInfo(String name) {
        if (!spy.containsKey(name)) {
            spy.put(name, 1);
        } else if (spy.containsKey(name)) {
            int val = spy.get(name);
            spy.put(name, 1 + val);
        }
    }

    public static int getAmount(String k) {
        return spy.get(k);
    }

    public static boolean checkName(String k) {
        return spy.containsKey(k);
    }


    }

