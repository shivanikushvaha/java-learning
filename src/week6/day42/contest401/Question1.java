package week6.day42.contest401;

public class Question1 {
    public static void main(String[] args) {
        int n = 3;
        int k = 5;
        int i = numberOfChild(n, k);
        System.out.println(i);
    }

    private static int numberOfChild(int n, int k) {
        int p = 0;
        int d = 1;
        for (int i = 0; i < k; i++) {
            p += d;
            if (p == n - 1 || p == 0) {
                d = -d;
            }
        }
        return p;
    }
}