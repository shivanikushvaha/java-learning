package week13.day91;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int i = majorityElement(nums);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int element = nums[0];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            }
            else if (element == nums[i]) count++;
            else count--;
        }
        return element;
    }
}
