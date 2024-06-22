package week8.day52.contest;

import java.util.Scanner;

public class DistributeCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            long N = scanner.nextLong();
            long M = scanner.nextLong();
            
            long remainder = M % N;
            if (remainder == 0) {
                System.out.println(0);
            } else {
                long toDestroy = remainder;
                long toMake = N - remainder;
                System.out.println(Math.min(toDestroy, toMake));
            }
        }
        
        scanner.close();
    }
}
