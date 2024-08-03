package week13.day88;

import java.util.Arrays;

public class IntegerMax {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));


        System.out.println("===========");


        int[][] arr2 = new int[3][4];
        int r = arr2.length;
        int c = arr2[0].length;

        for (int[] a : arr2) {
            Arrays.fill(a, 100);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] a : arr2) {
            System.out.println(Arrays.toString(a));
        }

    }
}
