package week2.day9;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
       List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> integerStream = list.stream().map(i -> i * i).toList();
        System.out.println(integerStream);

        List<Integer> oddList = integerStream.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i * i).toList();
        System.out.println(oddList);
    }
}
