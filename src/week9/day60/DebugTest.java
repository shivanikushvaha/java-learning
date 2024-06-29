package week9.day60;

import java.util.List;
import java.util.stream.Stream;

public class DebugTest {

    public static void main(String[] args) {

        Stream<Integer> list = List.of(1, 2, 3, 4, 5).stream();

        List<Integer> list1 = list
                .filter(e -> e % 2 == 0)
                .map(i -> i * i)
                .toList();
        System.out.println(list1);

    }
}
