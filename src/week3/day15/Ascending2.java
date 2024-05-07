package week3.day15;

import java.util.Arrays;

public class Ascending2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 10, 11};
        Arrays.sort(arr);
        for (int i : arr)
            System.out.println(i);

    }
}
