package week7.day43;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] heights = {1, 2, 3, 4, 5};
        int i = heightChecker(heights);
        System.out.println(i);
    }

    private static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
            temp[i] = heights[i];

        Arrays.sort(heights);
        int count = 0;

        for (int i = 0; i < n; i++)
            if (heights[i] != temp[i])
                count++;
        return count;
    }
}
