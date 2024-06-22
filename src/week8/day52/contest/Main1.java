package week8.day52.contest;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1)
                count++;
        }
        System.out.println(count);
    }
}
