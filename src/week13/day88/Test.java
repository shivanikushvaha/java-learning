package week13.day88;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "pushpendra");
        map.put("age", "24");
        map.put("age", "23");
        map.put(null, "test");
        map.put(null, "test2");
        System.out.println(map);

        System.out.println(map.get("id"));
        System.out.println(map.get("name"));
        System.out.println(map.get("address"));
        System.out.println(map.getOrDefault("address", "India"));
    }
}
