package week3.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        String str = "abcd acd dce bbe";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }
        System.out.println(map);

        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

        Integer i = 10;
        var k = 20;
        System.out.println();
        System.out.println(i.getClass().getName());
    }
}
