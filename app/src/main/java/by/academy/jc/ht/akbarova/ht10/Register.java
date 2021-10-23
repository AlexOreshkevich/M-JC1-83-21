package by.academy.jc.ht.akbarova.ht10;

import java.util.HashMap;
import java.util.Map;

public class Register {

    private static Register register = null;

    private final Map<String, Integer> info = new HashMap<>();

    public static Register getInstance() {
        if (register == null) {
            register = new Register();
        }
        return register;
    }

    public Map<String, Integer> getInfo() {
        return info;
    }

    public void notify(String className) {
        int count = info.get(className) == null ? 1 : info.get(className) + 1;
        info.put(className, count);
    }
}