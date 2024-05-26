package week4.day27;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Main3 main3 = new Main3();
        String s = main3.m1(new String[]{"apple", "appetizer", "appreciate", "application", "applied"});
        System.out.println(s);
    }

    private String m1(String[] strs) {
        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        int n = strs.length;

        String first = strs[0];
        String last = strs[n - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i))
                return sb.toString();
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}
