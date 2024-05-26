package week3.day17;

import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        String resultMap = Stream.of("hello")
                .map(s -> s + " world")
                .findFirst()
                .get();
        System.out.println(resultMap);

        String str = "hello";

        String resultMap1 = Stream.of("gool! ")
                .map(String::toUpperCase)
                .map(s -> s.repeat(2))
                .map(s -> s.replaceAll("O", "OO"))
                .findFirst()
                .get();
        System.out.println(resultMap1);

        String transform = "hello".transform(String::toUpperCase)
                .transform(s -> s.repeat(2))
                .transform(s -> s.replaceAll("O", "OO"));
        System.out.println(transform);

    }
}
