package week10.day67;

import java.util.Arrays;

public class FloodFillAlgorithm {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] ints = floodFill(image, sr, sc, newColor);
        for (int[] i : ints
        )
            System.out.println(Arrays.toString(i));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        dfs(sr, sc, image, color, newColor);
        return image;
    }

    private static void dfs(int i, int j, int[][] image, int color, int newColor) {
        if (i >= 0 && j >= 0 && i < image.length && j < image[0].length &&
                image[i][j] == color && image[i][j] != newColor) {
            image[i][j] = newColor;
            dfs(i, j + 1, image, color, newColor);
            dfs(i, j - 1, image, color, newColor);
            dfs(i + 1, j, image, color, newColor);
            dfs(i - 1, j, image, color, newColor);
        }
    }
}
