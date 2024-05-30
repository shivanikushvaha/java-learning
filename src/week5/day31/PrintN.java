package week5.day31;

public class PrintN {
    public static void main(String[] args) {
        int n = 10;

        PrintN.fun1(n);
    }

    private static void fun1(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        fun1(n - 1);
        System.out.println(n);
    }

}
