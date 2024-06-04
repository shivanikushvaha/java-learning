package week5.day34;

public class PalindromePartitioningRecursive {
    public static void main(String[] args) {
        String str = "ababbbabbababa";
        int n = str.length();
        int i = minPalPartition(str, 0, n - 1);
        System.out.println(i);
    }

    private static int minPalPartition(String str, int i, int j) {
        if (i >= j)
            return 0;
        if (str.equals(new StringBuilder(str).reverse().toString()))
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int temp = minPalPartition(str, i, k)
                    + minPalPartition(str, k + 1, j)
                    + 1;
            min = Math.min(min, temp);
        }
        return min;
    }
}