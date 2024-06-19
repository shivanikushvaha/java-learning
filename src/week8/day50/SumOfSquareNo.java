package week8.day50;

public class SumOfSquareNo {
    public static void main(String[] args) {
        int c = 2;
        boolean b = judgeSquareSum(c);
        System.out.println(b);
    }

    private static boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            for (long b = 0; b * b <= c; b++) {
                if (a * a + b * b == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
