package week13.day86;

public class NumberOfTeam {
    public static void main(String[] args) {
        int[] rating = {2, 5, 3, 4, 1};
        int i = numTeams(rating);
        System.out.println(i);
    }

    public static int numTeams(int[] rating) {
        int team = 0;
        int n = rating.length;

        // increasing order
        for (int i = 1; i < n; i++) {
            int temp = rating[i];
            int leftCount = 0;
            int rightCount = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (temp > rating[j])
                    leftCount++;
            }

            for (int j = i + 1; j < n; j++) {
                if (temp < rating[j])
                    rightCount++;
            }
            team += leftCount * rightCount;
        }

        // for decreasing order
        for (int i = 1; i < n; i++) {
            int temp = rating[i];
            int leftCount = 0;
            int rightCount = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (temp < rating[j])
                    leftCount++;
            }

            for (int j = i + 1; j < n; j++) {
                if (temp > rating[j])
                    rightCount++;
            }
            team += leftCount * rightCount;
        }

        return team;
    }
}
