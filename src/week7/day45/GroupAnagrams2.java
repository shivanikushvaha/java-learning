package week7.day45;

import java.util.*;

public class GroupAnagrams2 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println(lists);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        char[] arr = new char[26];
        Arrays.fill(arr, '0');

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strs[i].length(); j++) {
                arr[strs[i].codePointAt(j) - 97] = strs[i].charAt(j);
            }

            for (int k = 0; k < 26; k++) {
                if (arr[k] != '0')
                    sb.append(arr[k]);
            }

            if (!map.containsKey(sb.toString()))
                map.put(sb.toString(), new ArrayList<>());

            map.get(sb.toString()).add(strs[i]);
            Arrays.fill(arr, '0');

        }
        return new ArrayList<>(map.values());
    }
}
