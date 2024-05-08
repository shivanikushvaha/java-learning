package week3.day16;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> integers1 = List.of(1, 2, 2, 10, 100, 1, 2, 0, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> integers2 = new ArrayList<>(integers1);
        integers2.add(100);
        integers2.add(200);
        integers2.add(300);
        System.out.println(integers2);

        Set<Integer> set = new HashSet<>(integers1);
        System.out.println(set);

        System.out.println("=================================================");

        int[] arr = {1, 2, 2, 3, 3, 4};
        List<Integer> list = new ArrayList<>();
        for (int i : arr){
            list.add(i);
        }
        Set<Integer> set1 = new HashSet<>(list);
        System.out.println(set1);

        System.out.println("=======================================================");

        int[] array = Arrays.stream(arr).distinct().toArray();
        for (int i : array)
            System.out.println(i);
    }
}
