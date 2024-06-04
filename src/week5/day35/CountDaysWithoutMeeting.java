package week5.day35;

import java.util.HashSet;
import java.util.Set;

public class CountDaysWithoutMeeting {
    public static void main(String[] args) {
        int days = 5;
        int[][] meetings = new int[][] {{2, 4},{1,3}};
        int i = countDays(days, meetings);
        System.out.println(i);
    }

    public static int countDays(int days, int[][] meetings) {
        Set<Integer> set = new HashSet<>();
        int n = 0;
        for (int[] m : meetings){
            n = n + m.length;
            for (int i = m[0]; i <= m[1]; i++)
                set.add(i);
        }
        return days - set.size();
    }
}
