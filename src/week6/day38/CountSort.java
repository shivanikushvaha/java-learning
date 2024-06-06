package week6.day38;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        int max = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++)
            if (max < arr[i])
                max = arr[i];

        int[] c = new int[max + 1];
        Arrays.fill(c, 0);

        for (int i = 0; i < n; i++)
            c[arr[i]]++;

        int k = 0;
        for (int i = 0; i < max + 1; i++) {
            while (c[i] != 0){
                arr[k] = i;
                k++;
                c[i]--;
            }
        }

        for (int a : arr)
            System.out.println(a);
    }
}
