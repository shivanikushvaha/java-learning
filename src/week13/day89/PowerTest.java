package week13.day89;

public class PowerTest {
    public static void main(String[] args) {
        double v = help(0.00001, 2147483647);
        System.out.println(v);
    }

    public static double myPow(double x, int n) {
        return help(x, n);
    }

    public static double help(double x, int n) {
        if (n == 0) return 1;

        if (n < 0) return 1 / help(x, -n);

        if (n % 2 == 0) return help(x * x , n / 2);

        return x * help(x * x, (n - 1) / 2);
    }
}
