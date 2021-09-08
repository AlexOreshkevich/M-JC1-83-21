package by.academy.jc.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(-2);
        set.add(12);
        set.add(1);

        System.out.println();
        for (Integer item : set) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
