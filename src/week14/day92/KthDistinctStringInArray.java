package week14.day92;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringInArray {
    public static void main(String[] args) {
        String[] arr = {"jqrd", "k", "miy", "svuwg", "uv", "yttn", "bxu", "nymzu", "dpane", "x", "mb", "zm", "ae", "ihwtn", "kouej", "y", "zt", "h", "udx", "h", "imi", "zombs", "l", "hvt", "uor", "kzi", "tzm", "kde", "ml", "hmvz", "hriuy", "lav", "hlvw", "fnnj", "bdkh", "hu", "tuuob", "uc", "no", "qo", "ku", "foe"};
        String s = kthDistinct(arr, 27);
        System.out.println(s);
    }

    public static String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int len = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                len++;
                if (len == k) {
                    idx = i;
                }
            }
        }

        if (len == k) return arr[idx];
        else if (len == n) return arr[k - 1];
        else return "";
    }
}
