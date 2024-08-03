package week13.day88;

import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        Arrays.fill(arr, Integer.MAX_VALUE);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int[][] arr2 = new int[3][4];
        int r = arr2.length;
        int c = arr2[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = -1;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("======================================");
        for (int[] a : arr2) {
            Arrays.fill(a, Integer.MIN_VALUE);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
