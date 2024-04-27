package week2.day12;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 5, 3, 0, 3, 6, 8);
        Predicate<Integer> predicate = (e) -> (e % 2 == 0);
        Function<Integer, Integer> function = (i) -> (i * i);
        BinaryOperator<Integer> binaryOperator = (a, b) -> (a + b);
        Integer integer = list.stream()
                .filter(predicate)
                .map(function)
                .reduce(0, binaryOperator);
        System.out.println(integer);

        List<String> list1 = List.of("AAa", "PPPJP", "DDDklsdj", "KJJHkkk", "slM", "kjdskd", "khdi", "kudsfiojdkc");
        List<Integer> stringList = list1.stream()
                .map(i -> i.length())
                .toList();
        System.out.println(stringList);

    }
}
