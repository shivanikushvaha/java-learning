package week2.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Stream2 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.indexOf('o'));
        System.out.println(str.toCharArray());
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
//        System.out.println(str.lines());
        str.lines().forEach(System.out::println);

        String str1 = "Java is object oriented language";
        String[] strAraay = str1.split(" ");
        System.out.println(strAraay.length);
        for (String s : strAraay){
            System.out.print(s + " ");
        }
        System.out.println();
        Arrays.stream(strAraay).forEach(System.out::println);

        List<String> stringList = List.of("AAA", "bbb", "CCC", "ddd", "eee", "a", "b", "CC");
        List<String> list = stringList.stream()
                .map(e -> e.toUpperCase())
                .toList();

        List<String> collect = stringList.stream()
                .filter(e -> e.length() >= 3)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(list);

        IntStream intStream = str.chars();
        int[] arr = {1, 3, 4};
        IntStream stream = Arrays.stream(arr);
        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        IntStream.range(1, 10).forEach(System.out::println);
        intStream1.forEach(System.out::println);
    }
}
