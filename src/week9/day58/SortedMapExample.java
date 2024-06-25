package week9.day58;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        sortedMap.put(1, 10);
        sortedMap.put(10, 100);
        sortedMap.put(2, 1);
        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.firstEntry());
        System.out.println(sortedMap.lastEntry());
    }
}
