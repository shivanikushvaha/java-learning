package day7;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println("====================");

        List<Integer> integers = List.of(1, 2, 3, 4);
        System.out.println(integers);
//        integers.remove(3);
//        System.out.println(integers);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        System.out.println(list1);
    }
}
