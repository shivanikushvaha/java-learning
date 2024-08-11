package week14.day97;

import java.util.Arrays;

public class MissingAndRepeating3 {
    public static void main(String[] args) {
        int[] arr = {2, 2};
        int n = arr.length;
        int[] twoElement = findTwoElement(arr, n);
        System.out.println(Arrays.toString(twoElement));
    }

    public static int[] findTwoElement(int[] arr, int n) {
        int sum = 0;
        for (int num : arr)
            sum += num;

        int allSum = n * (n + 1) / 2;
        int sub = sum - allSum;

        int square = 0;
        for (int num : arr)
            square += num * num;

        int allSquare = (n * (n + 1) * (2 * n + 1)) / 6;

        int squareSub = square - allSquare;

        int val1 = squareSub / sub;

//        int x = (Math.abs(sub) + Math.abs(val1)) / 2;
        int x = (sub + val1) / 2;
        int y = sub - x;

        return new int[] {x, Math.abs(y)};
    }
}
