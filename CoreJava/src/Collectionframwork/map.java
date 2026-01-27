package Collectionframwork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class map {
    public static void main(String args[]) {
        Map<String, Integer> n = new LinkedHashMap<>();
        n.put("one", 1);
        n.put("two", 2);
        n.put("three", 3);
        n.put("four", 4);

        // System.out.println(n);
        // n.put("seven", 20);
        // System.out.println(n);

        System.out.println(n);
        if (!n.containsKey(("eight"))) {
            n.put("eight", 200);
        }
        System.out.println(n);

        n.put("three", 30);
        System.out.println(n);

        System.out.println(n.values());
        System.out.println(n.keySet());

        System.out.println(n.containsValue(200));

        n.remove("two");

        System.out.println(n);

    }
}