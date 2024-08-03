package week13.day90;

import java.util.Arrays;

public class MakeTwoEqualArrayByReversingSubarrays {
    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4};
        int[] arr = {2, 4, 1, 3};
        boolean b = canBeEqual(target, arr);
        System.out.println(b);
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length;

        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (target[i] != arr[i])
                return false;
        }
        return true;
    }
}
