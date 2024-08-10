package week14.day97;

public class CountInversion {
    public static void main(String[] args) {
        long[] arr = {7, 72, 90, 21, 60};
        int n = arr.length;
        long l = inversionCount(arr, n);
        System.out.println(l);
    }

    public static long inversionCount(long[] arr, int n) {
        long cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j] && i < j) cnt++;
            }
        }
        return cnt;
    }
}
