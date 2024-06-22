package week8.day55;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int i = minDays(bloomDay, m, k);
    }

    private static int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length)
            return -1;

        int startDay = 1;
        int endDay = Arrays.stream(bloomDay).max().getAsInt();
        int minDay = -1;

        while (startDay <= endDay) {
            int mid = startDay + (endDay - startDay) / 2;

            if (getNoOfDay(bloomDay, mid, k) >= m) {
                minDay = mid;
                endDay = mid - 1;
            } else {
                startDay = mid + 1;
            }
        }
        return minDay;
    }

    private static int getNoOfDay(int[] bloomDay, int mid, int k) {
        int noOfConsecutiveDays = 0;
        int noOfBouquets = 0;
        int n = bloomDay.length;

        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= mid) {
                noOfConsecutiveDays++;
            } else {
                noOfConsecutiveDays = 0;
            }

            if (noOfConsecutiveDays == k) {
                noOfBouquets++;
                noOfConsecutiveDays = 0;
            }
        }

        return noOfBouquets;
    }
}
