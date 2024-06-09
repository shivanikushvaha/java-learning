package week6.day41.biweekly132;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        int[] skills = {11,13};
        int k = 164383266;
        int winningPlayer = findWinningPlayer(skills, k);
        System.out.println(winningPlayer);
    }

    private static int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        int max = 0;
        int temp = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        if (k >= n) {
            
        }

        for (int y : skills) {
            map.put(y, 0);
            list.add(y);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(skills[0], skills[1]);
            map.put(max, map.get(max) + 1);

            if (map.get(max) == k)
                return list.indexOf(max);

            if (skills[0] == max) {
                temp = skills[1];
            }
            else {
                temp = skills[0];
                skills[0] = skills[1];
            }

            for (int j = 1; j < n - 1; j++) {
                skills[j] = skills[j + 1];
            }
            skills[n - 1] = temp;

        }

        return 0;
    }
}
