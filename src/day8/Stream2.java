package day8;

import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();
        System.out.println(emptyStream);

        Stream<Integer> streamList = Stream.of(1, 2, 3, 4);

        List<Integer> squareList = List.of(1, 2, 3, 4);
        List<Integer> squareList2 = squareList.stream().map(i -> i * i).toList();
        System.out.println(squareList2);

        List<Integer> squareOddList = squareList.stream()
                .filter(integer -> integer % 2 == 1)
                .map(i -> i * i)
                .toList();
        System.out.println(squareOddList);

        squareList.stream().map(i -> i * i).forEach(i -> System.out.println(i));
    }
}
