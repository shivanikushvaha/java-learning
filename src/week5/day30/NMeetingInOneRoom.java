package week5.day30;

import java.util.Arrays;
import java.util.Comparator;

public class NMeetingInOneRoom {

    public static int maxMeetings(int[] start, int[] end, int n) {
        Integer[][] pairs = new Integer[n][2];
        int count = 1;
        for (int i = 0; i < n; i++) {
            pairs[i][0] = end[i];
            pairs[i][1] = start[i];
        }
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < n; i++) {
            end[i] = pairs[i][0];
            start[i] = pairs[i][1];
        }

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (start[i] > end[j]) {
                j = i;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}