package week2.day11;

import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4);
        Integer sumofcube = integerList.stream()
                .map(i -> i*i*i)
                .reduce(0, Integer::max);

        Integer sumofOddno = integerList.stream()
                .filter(e -> e % 2 == 1)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sumofcube);
        System.out.println(sumofOddno);
    }
}
