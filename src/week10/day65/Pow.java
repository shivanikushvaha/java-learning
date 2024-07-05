package week10.day65;

public class Pow {
    public static void main(String[] args) {
        double x = 2.0000;
        int n = -2;
        double v = myPow(x, n);
        System.out.println(v);
        System.out.println(-4 % 2);
    }

    public static double myPow(double x, int n) {
        return solve(x, n);
    }

    private static double solve(double x, long n) {
        if (n == 1)
            return 1;

        if (n < 0)
            return solve(1 / x, -n);

        if (n % 2 == 0) {
            return solve(x * x, n / 2);
        }
        return x * solve(x * x, (n - 1) / 2);
    }
}
