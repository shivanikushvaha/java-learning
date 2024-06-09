package week6.day41.biweekly132;

public class Question1My {
    public static void main(String[] args) {
        String s = "cb34";
        String s1 = clearDigits(s);
        System.out.println(s1);
    }

    private static String clearDigits(String s) {
        int n = s.length();
        int i = 0;
        boolean isDigit = false;
        while (i < n) {
            if (Character.isDigit(s.charAt(i)))
                isDigit = true;
            i++;
        }
        if (!isDigit)
            return s;

        char[] charArray = s.toCharArray();

        for (int j = 0; j < n; j++) {
            if (Character.isDigit(charArray[j])) {
                charArray[j] = '0';
                int m = j - 1;
                while (m >= 0) {
                    if (Character.isLetter(charArray[m])) {
                        charArray[m] = '0';
                        break;
                    }
                    m--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : charArray)
            if (ch != '0')
                sb.append(ch);
        return sb.toString();
    }
}
