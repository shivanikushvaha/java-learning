package week3.day17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        String days = "Sunday\n"
                + "Monday\n"
                + "Tuesday\n"
                + "Wednesday\n"
                + "Thursday\n"
                + "Friday\n"
                + "Saturday";
        System.out.println(days.indent(4));

        String str = "abc def \t ghi";
        System.out.println(str.replaceAll(" ", ""));

        final String TEXT = " ... Illinois Mathematics & Science Academy ... ";
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String lowerCase = TEXT.toLowerCase();
        int vowels = 0;
        int constants = 0;
        for (int i = 0; i < lowerCase.length(); i++){
            char ch = lowerCase.charAt(i);
            if (set.contains(ch))
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                constants++;
        }
        System.out.println(vowels + " " + constants);
    }
}
