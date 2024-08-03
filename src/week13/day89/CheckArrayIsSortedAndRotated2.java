package week13.day89;

public class CheckArrayIsSortedAndRotated2 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        boolean check = check(nums);
        System.out.println(check);
    }

    public static boolean check(int[] nums) {
        int count=0;
        if (nums[0] < nums[nums.length - 1]) {
            count++;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
