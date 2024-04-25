package day10;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Function<Integer , Integer> function = i -> i * i;
        list.stream()
                .map(function)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Predicate<Integer> predicate = e -> e < 4;
        list.stream()
                .filter(predicate)
                .map(function)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
