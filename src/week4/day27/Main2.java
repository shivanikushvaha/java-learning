package week4.day27;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.m1("III");
    }

    private int m1(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++){
            if (i < n - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1)))
                ans = ans - m.get(s.charAt(i));
            else
                ans = ans + m.get(s.charAt(i));
        }
        return ans;
    }
}
