package week2.day8;

import java.util.List;
import java.util.stream.Stream;

import static java.util.List.of;

public class FlapMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3),
                List.of(2, 3, 4),
                List.of(44, 34, 23)
        );
        Stream<List<Integer>> l = list.stream();
        List<Integer> s1 = list.stream().flatMap(i -> i.stream()).map(i -> i * i).toList();
        System.out.println(s1);
    }
}



