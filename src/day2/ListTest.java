package day2;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("AAA");
        stringList.add("BBB");
        stringList.add("CCC");
        stringList.remove(2);
        stringList.remove("BBB");

        System.out.println(stringList.isEmpty());
        System.out.println(stringList.contains("AAA"));
        System.out.println(stringList.contains("CCC"));
        stringList.clear();
        System.out.println(stringList);

        System.out.println("==========================");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        System.out.println(integerList);

        System.out.println(integerList.subList(0, 3));
        List<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);

        integerList.addAll(0, integers);
        System.out.println(integerList);


    }
}
