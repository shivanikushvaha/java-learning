package week6.day38;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacter {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        int n = words.length;
        int[] last = count(words[0]);
        List<String> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            last = intersection(last, count(words[i]));
        }

        for (int i = 0; i < 26; i++) {
            while (last[i] != 0){
                list.add(String.valueOf((char)(i + 97)));
                last[i]--;
            }
        }
    }

    private static int[] count(String str) {
        int[] t = new int[26];
        for (char c : str.toCharArray()) {
            t[c - 'a']++;
        }
        return t;
    }

    private static int[] intersection(int[] a, int[] b) {
        int[] t = new int[26];
        for (int i = 0; i < 26; i++) {
            t[i] = Math.min(a[i], b[i]);
        }
        return t;
    }
}
