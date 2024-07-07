package week10.day69.biweeklycontest;

public class Main {
    public static void main(String[] args) {
        int[] color = {1, 1, 1};
        int i = numberOfAlternatingGroups(color);
        System.out.println(i);
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;
        int i = 0;
        int j = 1;
        int k = 2;

        while (k < n) {
            if (colors[i] != colors[j] && colors[i] == colors[k]) {
                count++;
            }
            i++;
            j++;
            k++;
        }
        if (colors[0] != colors[1] && colors[1] != colors[n - 1])
            count++;
        if (colors[0] != colors[n - 2] && colors[0] == colors[n - 1])
            count++;
        if (colors[n - 1] != colors[0] && colors[n - 1] == colors[1])
            count++;
        if (colors[n - 2] != colors[n - 1] && colors[n - 2] == colors[0])
            count++;
        return count;
    }
}
