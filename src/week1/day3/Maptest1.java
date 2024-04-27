package week1.day3;

import java.util.HashMap;
import java.util.Map;

public class Maptest1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 9);
        map.put(4, 16);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(7, 9) + 1);
        System.out.println(map.entrySet());

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}