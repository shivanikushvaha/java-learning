package week2.day10;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        integers.stream().forEach(e -> System.out.println(e));

        List<Integer> integerList = integers.stream().map(i -> i * i).toList();
        List<Integer> collect1 = integers.stream()
                .map(i -> i * i)
                .collect(Collectors.toUnmodifiableList());
//        collect1.add(100);
        System.out.println(integerList);

        List<Integer> collect = integers.stream().map(i -> i * i).collect(Collectors.toList());
        collect.add(25);
        System.out.println(collect);

        List<Integer> collect2 = integers.stream()
                .filter(i -> i > 3)
                .map(i -> i + 100)
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}
