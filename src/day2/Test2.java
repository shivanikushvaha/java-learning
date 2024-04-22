package day2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        list.add(1 , "DDD");

        System.out.println(list);

        System.out.println(list.add("DDDD"));

        System.out.println("----------------------------");

        System.out.println(list.get(0));
    }
}
