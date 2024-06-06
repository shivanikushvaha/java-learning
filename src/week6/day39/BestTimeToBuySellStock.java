package week6.day39;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        int i = maxProfit(prices);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int op = 0;
        int pist;
        int lsf = Integer.MAX_VALUE;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (prices[i] < lsf)
                lsf = prices[i];
            pist = prices[i] - lsf;
            if (op < pist)
                op = pist;
        }
        return op;
    }
}
