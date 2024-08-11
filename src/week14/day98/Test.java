package week14.day98;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 4}, {0, 1}};

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] a : arr)
            System.out.println(Arrays.toString(a));

    }
}
