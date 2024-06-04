package week5.day35;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {
                'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ',
                'p', 'l', 'a', 'n', ',', ' ', 'a', ' ',
                'c', 'a', 'n', 'a', 'l', ':', ' ',
                'P', 'a', 'n', 'a', 'm', 'a'
        };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int n = s.length - 1;
        int k = 0;
        int d = n / 2;
        while (d > k) {
            char temp = s[n];
            s[n] = s[k];
            s[k] = temp;
            n--;
            k++;
        }
        ;

        for (char c : s)
            System.out.print(c);
    }

    public void reverseString1(char[] s) {
        int start = 0, end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

    }
}
