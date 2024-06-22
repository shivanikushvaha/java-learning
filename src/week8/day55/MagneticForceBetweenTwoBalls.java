package week8.day55;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        int i = maxDistance(position, m);
        System.out.println(i);
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int minF = 1;
        int maxF = position[n - 1] - position[0];


    }
}
