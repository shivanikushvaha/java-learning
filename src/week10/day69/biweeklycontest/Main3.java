package week10.day69.biweeklycontest;

public class Main3 {
    public static void main(String[] args) {
        int[] color = {0,1,0,1,0};
        int k = 3;
        int i = numberOfAlternatingGroups(color, k);
        System.out.println(i);
    }

    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isAlternating = true;

            for (int j = 0; j < k; j++) {
                int prev = (i + j - 1 + n) % n;
                int curr = (i + j) % n;
                int next = (i + j + 1) % n;

                if (j > 0 && j < k - 1 && colors[curr] == colors[prev]) {
                    isAlternating = false;
                    break;
                }
            }

            if (isAlternating) {
                count++;
            }
        }

        return count;
    }
}
