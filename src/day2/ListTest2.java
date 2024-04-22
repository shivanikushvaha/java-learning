package day2;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println(list);

        for (Integer i : list) {
            System.out.println(i + 10);
        }

        System.out.println("====================");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
