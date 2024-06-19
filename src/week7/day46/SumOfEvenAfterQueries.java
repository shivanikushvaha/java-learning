package week7.day46;

public class SumOfEvenAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] ints = sumEvenAfterQueries(nums, queries);
        for (int i : ints)
            System.out.print(i + " ");
    }

    private static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] sumArr = new int[nums.length];

        for (int i = 0; i < n; i++) {
            int val = queries[i][0];
            int idx = queries[i][1];

            nums[idx] = nums[idx] + val;
            int sum = 0;
            for (int a : nums)
                if (a % 2 == 0)
                    sum+=a;
            sumArr[i] = sum;
        }
        return sumArr;
    }
}
