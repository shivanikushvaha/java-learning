package week7.day43;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trap = trap(height);
        System.out.println(trap);
    }

    private static int trap(int[] height) {
        int n = height.length;
        int[] leftMaxArr = new int[n];
        leftMaxArr[0] = height[0];
        int count = 0;

        for (int i = 1; i < n; i++) {
            leftMaxArr[i] = Math.max(leftMaxArr[i - 1], height[i]);
        }

        int[] rightMaxArr = new int[n];
        rightMaxArr[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMaxArr[i] = Math.max(rightMaxArr[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            int h = Math.min(rightMaxArr[i], leftMaxArr[i]) - height[i];
            count += h;
        }

        return count;
    }

}
