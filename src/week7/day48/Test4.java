package week7.day48;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        int[] capital = {10, 1, 1};
        int[] profits = {1, 2, 3};
        int n  = profits.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) arr[i][j] = capital[i];
                else arr[i][j] = profits[i];
            }
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));


    }
}
