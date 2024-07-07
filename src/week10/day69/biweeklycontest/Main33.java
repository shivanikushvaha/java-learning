package week10.day69.biweeklycontest;

public class Main33 {
    public static void main(String[] args) {
        int[] color = {1, 1, 0, 1};
        int k = 4;
        int i = numberOfAlternatingGroups(color, k);
        System.out.println(i);
    }

    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isAlternating = true;

            for (int j = 0; j < k - 1; j++) {
                int curr = (i + j) % n;
                int next = (i + j + 1) % n;

                if (colors[curr] == colors[next]) {
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
