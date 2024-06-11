package week7.day44;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.addFirst(10);
        list.set(0, 100);
        System.out.println(list);

        int[] arr = {1, 2, 3, 45};
    }
}
