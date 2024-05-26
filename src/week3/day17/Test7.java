package week3.day17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test7 {
    public static void main(String[] args) {
        String str = "123";
        IntStream chars = str.chars();

        final String TEXT = " ... Illinois Mathematics & Science Academy ... ";
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String lowerCase = TEXT.toLowerCase();

        Map<Boolean, Long> collect = lowerCase.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(Collectors.groupingBy(set::contains, Collectors.counting()));
        System.out.println(collect);
    }
}
