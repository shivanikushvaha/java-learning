package week14.day95;

public class LastestSubarrayWith0Sum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = 8;
        int i = maxLen(arr, n);
        System.out.println(i);
    }

    public static int maxLen(int arr[], int n) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0) count = j - i + 1;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
