package week14.day98;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {1, 4}};
        int[][] merge = merge(intervals);
        for (int[] m : merge)
            System.out.println(Arrays.toString(m));
    }

    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }

        int[][] temp = new int[ans.size()][2];

        int i = 0;
        for (List<Integer> l : ans) {
            temp[i][0] = l.get(0);
            temp[i][1] = l.get(1);
            i++;
        }
        return temp;
    }

}
