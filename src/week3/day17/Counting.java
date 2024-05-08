package week3.day17;

import java.util.HashMap;
import java.util.Map;

public class Counting {
    public static void main(String[] args) {
        String str = "akkjsanbnnnuuughhggj";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            map.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }
        System.out.println(map);
    }
}
