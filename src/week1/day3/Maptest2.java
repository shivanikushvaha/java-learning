package week1.day3;

import java.util.HashMap;
import java.util.Map;

public class Maptest2 {
    public static void main(String[] args) {
        Map<Integer, Map<String, String>> map = new HashMap<>();
        Map<String, String> m1 = new HashMap<>();
        m1.put("Name1", "Pushpendra");
        m1.put("Age1", "23");

        Map<String, String> m2 = new HashMap<>();
        m2.put("Name2", "Shivani");
        m2.put("Age2", "23");

        map.put(1, m1);
        map.put(2, m2);

        System.out.println(map);
        System.out.println("==============");
        for (Map.Entry<Integer, Map<String, String>> m : map.entrySet()){
            System.out.println(m);

            for (Map.Entry<String, String> m3 : m.getValue().entrySet()) {
                System.out.println(m3.getKey());
            }
        }
    }
}
