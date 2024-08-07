package week14.day93;

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int i = maxProfit(prices);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if (prices[i] > maxProfit) {
                minPrice = Math.min(prices[i], minPrice);
                maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            }
        }
        return maxProfit;
    }
}
