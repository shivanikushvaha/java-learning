package week8.day51;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {4, 5, 6, 7};
        int i = maxProfitAssignment(difficulty, profit, worker);
        System.out.println(i);
    }

    private static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int m = worker.length;
        int n = difficulty.length;

        int i = 0;
        for (int j = 0; j < m; j++) {
            while (i < n && difficulty[i] <= worker[j])
                i++;
            System.out.println(difficulty[i - 1]);
        }
        return 0;
    }
}
