package week6.day36;

public class EggDropingRecursive {
    public static void main(String[] args) {
        int i = superEggDrop(3, 26);
        System.out.println(i);
    }

    public static int superEggDrop(int k, int n) {
        if (n == 0 || n == 1)
            return n;
        if (k == 1)
            return n;

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int temp = 1 + Math.max(superEggDrop(k - 1, i - 1), superEggDrop(k, n - i));
            min = Math.min(temp, min);
        }
        return min;
    }
}
