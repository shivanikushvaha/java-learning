package week6.day42.contest401;

public class Question1My {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int i = numberOfChild(n, k);
        System.out.println(i);
    }

    private static int numberOfChild(int n, int k) {
        int i = 0;
        int m = 0;
        while (m < k) {
            if (i == n - 1) {
                while (m < k && i != 0) {
                    m++;
                    i--;
                    if (m == k)
                        return i;
                }
            } else if (m == k) {
                return i;
            } else {
                m++;
                i++;
            }
        }
        return i;
    }
}
