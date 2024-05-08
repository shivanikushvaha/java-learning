package week3.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicate {
    public static void main(String[] args) {
        String str = "abbcccdddd";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            map.compute(c, (k, v) -> v == null ? 1 : ++v);
        }
        System.out.println(map);
        System.out.println("-------------------------------------");

        int n = 100;
        if (n <= 10)
            System.out.println("Hello!");
        else
            System.out.println("World!");

        int no = 10;

        String string = no > 0 ? "Positive" : "Negative";
    }
}
