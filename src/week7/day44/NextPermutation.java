package week7.day44;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 5, 5, 3, 2};
        nextPermutation(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }

    private static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for (int i = n - 1; i > 0 ; i--)
            if (nums[i - 1] < nums[i]) {
                idx = i - 1;
                break;
            }


        if (idx != -1) {
            int swapIdx = idx;
            for (int j = n - 1; j >= idx + 1; j--) {
                if (nums[j] > nums[idx]) {
                    swapIdx = j;
                    break;
                }
            }

            swap(nums, idx, swapIdx);
        }

        int d = (n - (idx + 1)) / 2;

        for (int l = idx + 1; l <= d + idx; l++) {
            swap(nums, l, --n);
        }

    }

    private static void swap(int[] nums, int idx, int swapIdx) {
        int temp = nums[idx];
        nums[idx] = nums[swapIdx];
        nums[swapIdx] = temp;
    }
}
