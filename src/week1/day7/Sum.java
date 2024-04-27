package week1.day7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        int[] arr1 = new int[5];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 3;
        arr1[4] = 4;
        for (int a : arr1){
            System.out.println(a);
        }

        List<Integer> list = new ArrayList<>(5);
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);
        list.add(106);
        list.add(107);
        System.out.println(list);

    }
}
