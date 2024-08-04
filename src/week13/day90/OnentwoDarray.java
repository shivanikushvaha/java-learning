package week13.day90;

import week13.day88.IntegerMax;

import java.util.Arrays;

public class OnentwoDarray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;

            System.out.print(arr[i] + " ");

            Arrays.fill(arr, Integer.MAX_VALUE);
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.println("===================");

        int[][] arr1 = new int[3][4];
        int r = arr1.length;
        int c = arr1[0].length;


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = 10;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=================");

        for (int[] a : arr1) {
            Arrays.fill(a, Integer.MIN_VALUE);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

