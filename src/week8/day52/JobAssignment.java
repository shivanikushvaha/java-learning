package week8.day52;

import java.util.Arrays;

public class JobAssignment {
    public static void main(String[] args) {
        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {4, 5, 6, 7};

        int[] result = maxProfitAssignment(difficulty, worker, profit);
        System.out.println(Arrays.toString(result));
    }

    public static int[] maxProfitAssignment(int[] difficulty, int[] worker, int[] profit) {
        Arrays.sort(difficulty);
        Arrays.sort(worker);

        int n = difficulty.length;
        int m = worker.length;

        int[] result = new int[m];

        int i = 0;
        for (int j = 0; j < m; j++) {
            while (i < n && difficulty[i] <= worker[j]) {
                i++;
            }
            result[j] = i > 0 ? difficulty[i - 1] : 0;
        }

        return result;
    }
}
