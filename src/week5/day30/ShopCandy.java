package week5.day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopCandy {

    static ArrayList<Integer> candyStore(int[] candies, int N, int K) {
        ArrayList<Integer> list = new ArrayList<>();
        int val = N;
        int max = 0;
        int min = 0;

        Arrays.sort(candies);

        //min
        for (int i = 0; i < val; i++) {
            min += candies[i];
            val -= K;
        }

        int j = 0;
        for (int i = N - 1; i >= j; i--) {
            max += candies[i];
            j += K;
        }

        list.add(min);
        list.add(max);

        return list;
    }

    public static void main(String[] args) {
        int[] candies = new int[]{3, 2, 1, 4};
        int n = 4;
        int k = 2;
        ArrayList<Integer> integers = ShopCandy.candyStore(candies, n, k);
        System.out.println(integers);
    }
}
