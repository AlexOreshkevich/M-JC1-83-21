package by.academy.jc.ht.klimakhovich;

import java.util.HashMap;

public class Storage {
    static HashMap<String, Integer> spyStorage = new HashMap<>();

    public static void setInformation(String name) {
        if (!spyStorage.containsKey(name)) {
            spyStorage.put(name, 1);
        } else if (spyStorage.containsKey(name)) {
            int val = spyStorage.get(name);
            spyStorage.put(name, 1 + val);
        }
    }

    public static int amountOfThrows(String key) {
        return spyStorage.get(key);
    }

    public static boolean check(String key) {
        return spyStorage.containsKey(key);
    }
}
