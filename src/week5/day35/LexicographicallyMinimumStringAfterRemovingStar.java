package week5.day35;

public class LexicographicallyMinimumStringAfterRemovingStar     {
    public static void main(String[] args) {
        String s = "de*";
        String s1 = clearStars(s);
        System.out.println(s1);
    }

    private static String clearStars(String s) {
        if (!s.contains("*"))
            return s;

        int n = s.length();
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char[] temp;

        for (int i = n - 1; i > 0; i--) {
            if (charArray[i] == '*'){
                charArray[i] = '0';
                charArray[i - 1] = '0';
                i--;
            }
        }

        for (char c : charArray) {
            if (c != '0'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
