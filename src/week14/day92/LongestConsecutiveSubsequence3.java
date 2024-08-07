package week14.day92;

public class LongestConsecutiveSubsequence3 {

    public static boolean linearSearch(int[] a, int num) {
        for (int j : a) {
            if (j == num)
                return true;
        }
        return false;
    }

    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        int maxCount = 1;

        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;
            while (linearSearch(a, x + 1)) {
                x += 1;
                cnt += 1;
            }

            maxCount = Math.max(maxCount, cnt);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}

