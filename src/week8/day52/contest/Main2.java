package week8.day52.contest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int temp = m;

            if (m % n == 0) {
                System.out.println(0);
                break;
            }

            int t1 = 0;
            int t2 = 0;

            while (m++ % n != 0) {
                t1++;
            }

            while (temp-- % n != 0) {
                t2++;
            }
            if (temp == -1)
                System.out.println(t1);
            else
                System.out.println(Math.min(t1, t2));
        }

    }
}
