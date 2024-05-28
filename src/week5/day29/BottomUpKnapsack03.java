package week5.day29;

public class BottomUpKnapsack03 {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int knapSack(int W, int[] wt, int[] val, int n) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] profit = new int[]{60, 100, 120};
        int[] weight = new int[]{10, 20, 30};
        int W = 50;
        int n = profit.length;

        System.out.println(knapSack(W, weight, profit, n));
    }
}
