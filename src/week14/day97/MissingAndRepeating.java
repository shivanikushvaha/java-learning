package week14.day97;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int n = arr.length;
        int[] twoElement = findTwoElement(arr, n);
        System.out.println(Arrays.toString(twoElement));
    }

    public static int[] findTwoElement(int arr[], int n) {
        int repeat = -1;
        int missing = -1;
        SortedMap<Integer, Integer> map = new TreeMap<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int i = 1;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 2) repeat = m.getKey();

            if (m.getKey() != i) {
                missing = m.getKey() - 1;
                i++;
            }
            i++;
        }

        if (missing == -1) missing = map.size() + 1;
        return new int[]{repeat, missing};
    }
}
