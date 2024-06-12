package week7.day45;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] height = {1, 1};
        int i = maxArea(height);
        System.out.println(i);
    }

    private static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int a = 0;

        while (i < j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            a = Math.max(h * w, a);

            if (height[i] > height[j]) j--;
            else i++;
        }
        return a;
    }
}
