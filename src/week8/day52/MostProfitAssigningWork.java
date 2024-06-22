package week8.day52;

import java.util.Arrays;
import java.util.Comparator;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {4, 5, 6, 7};
        int i = maxProfitAssignment(difficulty, profit, worker);
        System.out.println(i);
    }

    private static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] job = new int[n][2];

        for (int i = 0; i < n; i++) {
            job[i][0] = difficulty[i];
            job[i][1] = profit[i];
        }

        Arrays.sort(job, Comparator.comparingInt(j -> j[0]));

        Arrays.sort(worker);

        int maxProfit = 0;
        int totalProfit = 0;
        int i = 0;

        for (int ability : worker) {
            while (i < n && job[i][0] <= ability) {
                maxProfit = Math.max(maxProfit, job[i][1]);
                i++;
            }
            totalProfit += maxProfit;
        }
        return totalProfit;
    }
}
