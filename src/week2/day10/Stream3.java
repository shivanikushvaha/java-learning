package week2.day10;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Function<Integer, Integer> function = (i) -> (i + i);
        integers.stream().map(function).forEach(System.out::println);

        String str = "Hello";
        int i = 10;
        System.out.println(str.charAt(i));

        Integer integer = 10;
        Long l = 1034l;

        Float f = 10.0f;
        Double d = 10.443;

        Predicate<Integer> predicate = e1 -> e1 > 3;
        integers.stream().filter(predicate).map(function).collect(Collectors.toList());
        /*
        Integer
        Float
        Double
        Long
         */
    }
}
