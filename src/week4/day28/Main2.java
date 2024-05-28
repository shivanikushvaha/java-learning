package week4.day28;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : charArray)
            set.add(c);

        set.size();
    }
}
