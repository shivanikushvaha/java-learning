package week7.day48;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO502 {
    public static void main(String[] args) {
        int k = 10;
        int w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 2};
        int maximizedCapital = findMaximizedCapital(k, w, profits, capital);
        System.out.println(maximizedCapital);
    }

    private static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n  = profits.length;
        int[][] arr = new int[n][2];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) arr[i][j] = capital[i];
                else arr[i][j] = profits[i];
            }
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int i = 0;
        // {(0, 1), (1, 2), (1, 3)}
        while (k-- > 0) {
            while (i < n && arr[i][0] <= w){
                priorityQueue.add(arr[i][1]);
                i++;
            }
            if (priorityQueue.isEmpty()) {
                break;
            }
            w += priorityQueue.poll();
        }

        return w;
    }
}
