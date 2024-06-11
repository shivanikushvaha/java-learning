package week6.day41.biweekly132;

public class Question2 {
    public static void main(String[] args) {
        int[] skills = {11, 13};
        int k = 164383266;
        int winningPlayer = findWinningPlayer(skills, k);
        System.out.println(winningPlayer);
    }

    private static int findWinningPlayer(int[] skills, int k) {
        if (k >= skills.length) {
            int idx = 0;
            for (int i = 0; i < skills.length; i++) {
                if (skills[i] > skills[idx]) idx = i;
            }
            return idx;
        }

        int pre = 0, cnt = 0;
        int n = skills.length;
        int[] s = new int[n + n];
        for (int i = 0; i < n; i++) {
            s[i] = s[n + i] = skills[i];
        }
        for (int i = 1; i < n + n; i++) {
            if (s[i] > s[pre]) {
                pre = i;
                cnt = 1;
            } else {
                cnt++;
            }
            if (cnt >= k) return pre;
        }
        return -1;
    }
}
