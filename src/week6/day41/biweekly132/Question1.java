package week6.day41.biweekly132;

public class Question1 {
    public static void main(String[] args) {
        String s = "cb34";
        String s1 = clearDigits(s);
        System.out.println(s1);
    }

    private static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >='0' && c <= '9') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else
                sb.append(c);
        }
        return sb.toString();
    }
}
