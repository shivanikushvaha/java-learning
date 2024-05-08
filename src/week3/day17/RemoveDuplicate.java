package week3.day17;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 3, 2, 3, 2, 4, 5, 5, 5, 6, 0, 7, 7);
        List<Integer> list2 = new ArrayList<>(list1);

        Set<Integer> set = new HashSet<>(list2);
        System.out.println(set);

        System.out.println("*****************************");

        int[] arr = {1, 1, 3, 3, 5, 3, 0, 4, 5, 4, 6, 6, 0, 2};
        List<Integer> list3 = new ArrayList<>();

        for (int i : arr) {
            list3.add(i);
        }
        Set<Integer> set1 = new HashSet<>(list3);
        System.out.println(set1);

        System.out.println("**********************************");

        int[] array = Arrays.stream(arr).distinct().toArray();
        for (int i : array)
            System.out.println(i);

    }
}
