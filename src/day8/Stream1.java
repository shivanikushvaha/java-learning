package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        List<Integer> squareList = new ArrayList<>();
        for (Integer i : list){
            squareList.add(i * i);
        }
        System.out.println(squareList);

        List<Integer> squareOddList = new ArrayList<>();
        for (Integer n : list){
            if (n % 2 == 1)
                squareOddList.add(n * n);
        }
        System.out.println(squareOddList);

        System.out.println("=================================");

        Stream<Object> empty = Stream.empty();
        System.out.println(empty);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Stream.of();
        System.out.println(integerStream);

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> squareList1 = list1.stream().map(i -> i * i).toList();
        System.out.println(squareList1);

        List<Integer> squareOddList2 = list1.stream().filter(i -> i % 2 == 1).map(i -> i * i).toList();
        System.out.println(squareOddList2);

        System.out.println("=========================================");

        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);
        List<Integer> list2 = integerStream1.map(i -> i * i).toList();
        System.out.println(list2);
        Stream.of(1, 2, 3, 4).map(i -> i * i).toList().forEach(System.out::println);

//        List<Integer> list3 = integerStream1.filter(i -> i % 2 == 1).map(i -> i * i).toList();
//        System.out.println(list3);

        System.out.println("=====================================");


        List<Integer> list4 = Arrays.asList(1, 2, 3, 4);
        list4.stream().forEach(e -> System.out.println(e * e));
    }
}
