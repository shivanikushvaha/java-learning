package week10.day69.biweeklycontest;

public class Main11 {
    public static void main(String[] args) {
        int[] color = {0, 1, 0, 0, 1, 0, 1};
        int i = numberOfAlternatingGroups(color);
        System.out.println(i);
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int prev = (i - 1 + n) % n;
            int next = (i + 1) % n;

            if (colors[i] != colors[prev] && colors[i] != colors[next]) {
                count++;
            }
        }

        return count;
    }
}
