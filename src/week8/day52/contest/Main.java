package week8.day52.contest;

import java.util.*;

public class Main {
    private static final int M = 1000002;
    private static List<Integer> primes = new ArrayList<>();
    private static int[] sppf = new int[M];

    public static void main(String[] args) {
        calcSPF();
        for (int i = 2; i < M; i++) {
            if (sppf[i] == i) {
                primes.add(i);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            code(scanner);
        }
        scanner.close();
    }

    private static void calcSPF() {
        sppf[1] = 1;
        for (int i = 2; i < M; i++) {
            if (sppf[i] == 0) {
                sppf[i] = i;
                for (int j = i * i; j < M; j += i) {
                    if (sppf[j] == 0) {
                        sppf[j] = i;
                    }
                }
            }
        }
    }

    private static void code(Scanner scanner) {
        int k = scanner.nextInt();
        long res = 0;
        if (sppf[(int) k] == k) {
            for (int i = 0; i < primes.size() && primes.get(i) <= k; i++) {
                res += primes.get(i) * k;
            }
        } else {
            for (int i = 0; i < primes.size() && primes.get(i) <= sppf[(int) k]; i++) {
                res += primes.get(i) * k;
            }
        }
        System.out.println(res);
    }
}
