package week6.day37;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {10, 9, 11, 6, 15, 2};
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (nums[minIdx] > nums[j])
                    minIdx = j;

            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }

        for (int i : nums)
            System.out.println(i);
    }
}
