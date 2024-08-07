package week13.day90;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id", "100");
        map.put("Name", "Shivani");
        map.put("Age", "24");
        map.put("id", "1");
        map.put("Age", "20");

        System.out.println(map);
        System.out.println(map.get("Name"));
        System.out.println(map.get("Address"));
        System.out.println(map.getOrDefault("Address", "Gujarat"));
        System.out.println(map);
    }
}
