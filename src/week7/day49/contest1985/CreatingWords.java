package week7.day49.contest1985;

import java.util.*;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();

        }
        input.close();
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