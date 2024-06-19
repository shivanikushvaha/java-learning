package week7.day46;

import java.util.Arrays;

public class OriginalArrayFromDoubledArray {
    public static void main(String[] args) {
        int[] changed = new int[]{1, 3, 4, 2, 6, 8};
        int[] originalArray = findOriginalArray(changed);
        for (int i : originalArray)
            System.out.print(i + " ");
    }

    private static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        int[] arr = new int[n / 2];

        Arrays.sort(changed);

        if (n % 2 != 0)
            return new int[]{};

        int l = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (changed[i] * 2 == changed[j]) {
                    arr[l++] = changed[i];
                }
            }
            if (l == (n / 2))
                break;;
        }

        return arr;

    }
}
