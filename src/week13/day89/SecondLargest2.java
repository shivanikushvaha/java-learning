package week13.day89;

import java.util.List;

public class SecondLargest2 {
    public static void main(String[] args) {
        List<Integer> arr = List.of(12, 35, 1, 10, 34, 1);
        int i = print2largest(arr);
        System.out.println(i);
    }

    public static int print2largest(List<Integer> arr) {
        int firstLargest, secondLargest;
        firstLargest = secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
