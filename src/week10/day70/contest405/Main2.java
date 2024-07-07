package week10.day70.contest405;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int n = 3;
        List<String> list = validStrings(n);
        System.out.println(list);
    }

    public static List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        generateStrings(new StringBuilder(), n, result);
        return result;
    }

    private static void generateStrings(StringBuilder sb, int n, List<String> result) {
        if (sb.length() == n) {
            result.add(sb.toString());
            return;
        }

        if (sb.isEmpty() || sb.charAt(sb.length() - 1) == '1') {
            sb.append('0');
            generateStrings(sb, n, result);
            sb.setLength(sb.length() - 1);

            sb.append('1');
            generateStrings(sb, n, result);
            sb.setLength(sb.length() - 1);
        } else {
            sb.append('1');
            generateStrings(sb, n, result);
            sb.setLength(sb.length() - 1);
        }
    }
}
