package by.academy.jc.ht.zhabko;

import java.util.HashMap;
import java.util.Map;

public class SpyStorage {

    private static SpyStorage INSTANCE;
    private Map<String,Integer> spyStorage;


    public static SpyStorage getInstance () {
        if (INSTANCE == null) {
            INSTANCE = new SpyStorage();
            return INSTANCE;
        } else {
         return INSTANCE;
        }
    }

    private SpyStorage() {
       spyStorage = new HashMap<>();
    }

    public boolean isContainsClassName(String key) {
        return spyStorage.containsKey(key);
    }

    public Integer getFrequency(String key) {
        return spyStorage.get(key);
    }



    public void setInformation(String className) {
        if (!spyStorage.containsKey(className)) {
            spyStorage.put(className,1);
        } else {
            int freq = spyStorage.get(className);
            spyStorage.put(className,freq+1);
        }
    }

    /*
    public void show() {
        System.out.println(spyStorage);
    }
    */

}
