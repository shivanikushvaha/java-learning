package day1;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("AAA");

        list.add(0, "000");

        System.out.println(list);

        System.out.println("_------------------");

        System.out.println(list.get(1));

    }
}
