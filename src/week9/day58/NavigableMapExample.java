package week9.day58;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, Integer> navigableMap = new TreeMap<>();
        navigableMap.put(1, 10);
        navigableMap.put(2, 20);
        navigableMap.put(0, 100);
        navigableMap.put(3, 30);
        System.out.println(navigableMap);
        System.out.println(navigableMap.descendingMap());
        System.out.println(navigableMap.descendingKeySet());
        System.out.println(navigableMap.keySet());
    }
}
