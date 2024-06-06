package week6.day38;

public class ScoreOfString {
    public static void main(String[] args) {
        String str = "hello";
        int i = scoreOfString(str);
        System.out.println(i);
    }

    public static int scoreOfString(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            sum = sum + Math.abs(s.codePointAt(i) - s.codePointAt(i + 1));
        }
        return sum;
    }
}
