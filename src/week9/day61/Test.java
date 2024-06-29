package week9.day61;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y < -1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
