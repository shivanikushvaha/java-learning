package week3.day17;

import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        int i1 = -45;
        int i2 = -15;
        int min = Math.min(i1, i2);
        int max = Math.max(i1, i2);
        System.out.println(min);
        System.out.println(max);

        List<Integer> integers = List.of(1, 2, 3, 4);
        System.out.println(integers.size());

        long count = Stream.of(1, 2, 3, 4).count();

        var list = List.of(1, 2, 3, 4);
    }

    public void sum(){

    }

    public void sub(){

    }

}
