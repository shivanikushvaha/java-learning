package week7.day44.codeforce1985;

import java.util.*;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            String str = input.next();
            String ans = Solution.creatingWords(str);
            System.out.println(ans);
        }
    }
}

class Solution {
    static String creatingWords(String str) {
        char[] charArray = str.toCharArray();
        char ch = charArray[0];
        charArray[0] = charArray[5];
        charArray[5] = ch;

        StringBuilder sb = new StringBuilder();

        for (char c : charArray)
            sb.append(c);

        return sb.toString();
    }
}
