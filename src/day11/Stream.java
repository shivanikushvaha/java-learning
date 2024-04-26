package day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("l"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.isEmpty());
        System.out.println(str.toCharArray());

       String str1 = "Java is a typical language";
        String[] strArray = str1.split(" ");
        for (String s : strArray)
            System.out.print(s + " ");
        System.out.println();
        System.out.println(strArray.length);
        Arrays.stream(strArray).forEach(System.out::println);

        List<String> stringList = List.of("AAA", "bbb", "ccc", "DDD", "eee", "qqqqqq", "a", "SSSSSS", "HHHH");
        System.out.println(stringList.size());
        stringList.stream()
                .map(i -> i.toLowerCase())
                .forEach(System.out::println);

        stringList.stream()
                .map(i -> i.toUpperCase())
                .forEach(System.out::println);

        stringList.stream()
                .map(i -> i.contains("e"))
                .forEach(System.out::println);

        List<String> collect = stringList.stream()
            .filter(i -> i.length() <= 3)
            .collect(Collectors.toList());
        System.out.println(collect);
    }
}
