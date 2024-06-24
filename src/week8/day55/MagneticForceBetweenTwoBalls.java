package week8.day55;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        int[] position = {1, 2, 3, 4, 7};
        int m = 3;
        int i = maxDistance(position, m);
        System.out.println(i);
    }

    private static boolean isPlace(int[] position, int midF, int m) {
        int n = position.length;
        int prev = position[0];
        int countBalls = 1;

        for (int i = 1; i < n; i++) {
            int curr = position[i];

            if (curr - prev >= midF) {
                countBalls++;
                prev = curr;
            }
            if (countBalls == m)
                break;
        }
        return countBalls == m;
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int minF = 1;
        int maxF = position[n - 1] - position[0];
        int result = 0;

        while (minF <= maxF) {
            int midF = minF + (maxF - minF) / 2;

            if (isPlace(position, midF, m)) {
                result = midF;
                minF = midF + 1;
            } else {
                maxF = midF - 1;
            }
        }
        return result;
    }
}
