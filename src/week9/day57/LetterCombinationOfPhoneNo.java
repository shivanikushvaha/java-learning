package week9.day57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNo {
    public static void main(String[] args) {
        String digits = "23";
        List<String> list = letterCombinations(digits);
        System.out.println(list);
    }

    public static List<String> letterCombinations(String digits) {
        int n = digits.length();
        List<String> list = new ArrayList<>();

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        String[] alpha = new String[n];

        for (int i = 0; i < n; i++) {
            alpha[i] = map.get(digits.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < alpha[i].length(); j++) {
                list.add(alpha[i].charAt(i) + "" + alpha[i].charAt(j));
            }
        }

        return list;
    }
}
