package week9.day60;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("hello world");
        int x = 10;
        System.out.println(x);
        String str = "Push";
        m1();
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
        m4();
    }

    public static void m1() {
        System.out.println("m1() called!");
        System.out.println("again");
        if (m2() == 100)
            System.out.println("1000");
        else
            System.out.println("else");
        m2();
    }

    public static int m2() {
        System.out.println("m2() called");
        return 10;
    }

    public static void m3() {
        System.out.println("kjfdlskfj");
    }

    public static void m4() {
        System.out.println(m2());
    }
}
