package week13.day90;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {8, -9, 10, -2, -10, 6, 18, 17};
        int n = 8;
        int k = 17;
        int i = lenOfLongSubarr(arr, n, k);
        System.out.println(i);
    }

    public static int lenOfLongSubarr (int A[], int N, int K) {
        int count = 0;
        int maxCount = 0;
        int sum;

        for (int i = 0; i < N; i++) {
            sum = A[i];
            if (sum == K) count = 1;
            for (int j = i + 1; j < N; j++) {
                sum += A[j];
                if (sum == K) count = j - i + 1;
            }
            maxCount = Math.max(maxCount, count);
            count = 0;
        }
        return maxCount;
    }
}
