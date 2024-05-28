package week5.day30;

import java.util.ArrayList;
import java.util.Arrays;

class ShopCandy2 {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        Arrays.sort(candies);
        int val = N;
        int min = 0;
        int max = 0;
        for (int i = 0; i < val; i++) {
            min += candies[i];
            val -= K;
        }
        int j = 0;
        for (int i = N - 1; i >= j; i--) {
            max += candies[i];
            j += K;
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(min);
        ans.add(max);

        return ans;

        // code here
    }

    public static void main(String[] args) {

    }
}