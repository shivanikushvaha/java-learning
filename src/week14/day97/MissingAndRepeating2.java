package week14.day97;

import java.util.Arrays;

public class MissingAndRepeating2 {
    public static void main(String[] args) {
        int[] arr = {12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int n = arr.length;
        int[] twoElement = findTwoElement(arr, n);
        System.out.println(Arrays.toString(twoElement));
    }

    public static int[] findTwoElement(int[] arr, int n) {
        int[] map = new int[n + 1];

        for (int i = 0; i < n; i++) {
            map[arr[i]]++;
        }

        int missing = -1;
        int repeat = -1;
        for (int i = 1; i < n + 1; i++) {
            if (map[i] == 2) repeat = i;
            if (map[i] == 0) missing = i;

            if (missing != -1 && repeat != -1) break;
        }

        return new int[] {repeat, missing};
    }
}
