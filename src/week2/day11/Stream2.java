package week2.day11;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        Function<Integer, Integer> function = (i) -> (i * i);
        BiFunction<Integer, Integer, Integer> function1 = (a, b) -> (a + b);
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        BinaryOperator<Integer> binaryOperator1 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };


        Integer reduce = integers.stream()
                .map(function)
                .reduce(0, binaryOperator);

        System.out.println(reduce);

        List<Integer> numbers = List.of(12,9,7,4,23,7,9);
        List<Integer> list = numbers.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(list);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> list1 = courses.stream().map(e -> e.length()).toList();
        System.out.println(list1);
    }
}
