package by.academy.jc.ht.dubautsova;

import java.util.LinkedHashMap;
import java.util.Map;

public class SpyCounter {
    public static Map<String, Integer> entries = new LinkedHashMap<>();

    public static void add(String className) {
        entries.put(className, entries.getOrDefault(className,0) + 1);
    }
    public static String getAll() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry: entries.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
