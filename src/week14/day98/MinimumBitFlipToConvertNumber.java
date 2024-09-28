package week14.day98;

public class MinimumBitFlipToConvertNumber {
    public static void main(String[] args) {
        int start = 3;
        int goal = 4;
        int i = minBitFlips(start, goal);
        System.out.println(i);
    }

    public static int minBitFlips(int start, int goal) {
        String startString = Integer.toBinaryString(start);
        String goalString = Integer.toBinaryString(goal);
        int m = startString.length();
        int n = goalString.length();
        int count = 0;

        if (m > n) {
            StringBuilder zero = new StringBuilder();
            for (int i = 0; i < Math.abs(m - n); i++) {
                zero.append("0");
            }
            goalString = zero + goalString;
        } else {
            StringBuilder zero = new StringBuilder();
            for (int i = 0; i < Math.abs(m - n); i++) {
                zero.append("0");
            }
            startString = zero + startString;
        }

        for (int i = 0; i < Math.max(m, n); i++) {
            if (startString.charAt(i) != goalString.charAt(i))
                count++;
        }

        return count;
    }
}
