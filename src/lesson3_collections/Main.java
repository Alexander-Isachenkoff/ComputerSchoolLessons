package lesson3_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("привет 1");
        linkedHashSet.add("не привет 2");
        linkedHashSet.add("hello 3");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("привет 1");
        hashSet.add("не привет 2");
        hashSet.add("hello 3");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("привет 1");
        treeSet.add("hello 3");
        treeSet.add("не привет 2");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }

        for (String s : treeSet) {
            System.out.println(s);
        }

        for (String s : hashSet) {
            System.out.println(s);
        }

        Map<String, String> map = new TreeMap<>();
        map.put("key 1", "GПривет 1");
        map.put("alpha", "Hello 2");
        map.put("epsilon", "Конец 3");
        map.put("key 1", "Gпривет 2");

        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
    }
}
