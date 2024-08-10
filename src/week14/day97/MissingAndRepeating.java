package week14.day97;

import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        int[] twoElement = findTwoElement(arr, 3);
        System.out.println(Arrays.toString(twoElement));
    }

    public static int[] findTwoElement(int arr[], int n) {
        Arrays.sort(arr);
        int missing = 0;
        int repeat = 0;
        for (int i = 0; i < n - 1; i++) {
            if (!(arr[i] == arr[i] + 1)) missing = arr[i] + 1;
            if (arr[i] == arr[i + 1]) repeat = arr[i];
        }

        return new int[]{repeat, missing};
    }
}
