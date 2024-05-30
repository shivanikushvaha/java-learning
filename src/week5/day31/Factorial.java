package week5.day31;

public class Factorial {
    public static void main(String[] args) {
        int fact = Factorial.fact(5);
        System.out.println(fact);
    }

    private static int fact(int n){
        if (n == 1)
            return 1;
        return fact(n - 1) * n;
    }
}
