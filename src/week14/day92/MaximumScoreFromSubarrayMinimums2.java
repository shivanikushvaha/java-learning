package week14.day92;

import java.util.List;

public class MaximumScoreFromSubarrayMinimums2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(453, 342, 522, 375, 71, 71, 993);
        int i = pairWithMaxSum(integers);
        System.out.println(i);
    }

    public static int pairWithMaxSum(List<Integer> arr) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            maxi = Math.max(sum, maxi);
        }
        return maxi;
    }
}
