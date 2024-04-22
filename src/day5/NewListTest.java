package day5;


import java.util.ArrayList;
import java.util.List;

public class NewListTest {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);

        list.add(list1);
        list.add(list2);
        list.add(list3);

        System.out.println(list);

        for (List<Integer> l : list) {
            for (Integer i : l)
                System.out.println(i);
        }
    }
}
