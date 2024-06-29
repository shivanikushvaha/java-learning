package week9.day58;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putFirst(1, "AAA");
        linkedHashMap.putFirst(0, "KKK");
        System.out.println(linkedHashMap);
    }
}
