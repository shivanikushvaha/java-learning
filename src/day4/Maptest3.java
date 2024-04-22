package day4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maptest3 {
    public static void main(String[] args) {
        Map<Integer, Map<String, String>> m = new HashMap<>();
        Map<String, String> m1 = new HashMap<>();
        m1.put("Name1", "Pallavi");
        m1.put("Age1", "20");

        Map<String, String> m2 = new HashMap<>();
        m2.put("Name2", "Aman");
        m2.put("Age2", "18");

        Map<String, String> m3 = new HashMap<>();
        m3.put("Name3", "Seema");
        m3.put("Age3", "21");

        m.put(1, m1);
        m.put(2, m2);
        m.put(3, m3);

        System.out.println(m);
        System.out.println(m.entrySet());
        System.out.println(m.get(3));
        System.out.println(m.size());
        System.out.println(m.values());

        for (Map.Entry<Integer, Map<String, String>> m4 : m.entrySet()) {
            System.out.println(m4);

            for (Map.Entry<String, String> m5 : m4.getValue().entrySet()) {

                System.out.println(m5.getValue());
            }
        }
    }
}
