package week2.day14;

import week1.day7.Sum;
import week2.day10.Stream;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // n(n+1)/2 6*7/2 = 21
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        int sumOfArray = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println(sumOfArray);
    }
}
