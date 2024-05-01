package week2.day14;

import java.util.Arrays;
import java.util.Comparator;

public class Array2 {
    public static void main(String[] args) {
        // [1, 2, 4, 6, 0]
        // revers [0, 6, 4, 2, 1]
        int[] arr = {1, 2, 4, 6, 0};
//        Arrays.stream(arr).sorted().forEach(System.out::println);

        int[] reverseArr = new int[arr.length];
        int n = arr.length;

        for(int i = n-1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }
        for (int i : reverseArr){
            System.out.println(i);
        }
    }
}
