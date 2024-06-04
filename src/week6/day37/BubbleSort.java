package week6.day37;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {10, 9, 11, 6, 15, 2};
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i : nums)
            System.out.println(i);
    }
}
