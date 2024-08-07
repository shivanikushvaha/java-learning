package week14.day93;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int i = maxProfit(prices);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[i] < prices[j]) {
                    int profit = prices[j] - prices[i];
                    maxProfit = Math.max(profit, maxProfit);
                }
            }
        }
        return maxProfit;
    }
}
