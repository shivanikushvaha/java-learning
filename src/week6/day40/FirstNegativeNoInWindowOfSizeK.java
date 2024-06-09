package week6.day40;

public class FirstNegativeNoInWindowOfSizeK {
    public static void main(String[] args) {
        long[] A = {-8, 2, 3, -6, 10};
        int N = 5;
        int K = 2;
        long[] longs = printFirstNegativeInteger(A, N, K);
        for (long l : longs)
            System.out.println(l + " ");
    }

    private static long[] printFirstNegativeInteger(long[] A, int N, int K) {
        int i = 0, j = 0;
        int idx = 0;
        long[] arr = new long[(N - K) + 1];

        while (j < N) {
            if ((j - i) + 1 == K){
                int m = i;
                boolean flag = false;
                while (m < K + i){
                    if (A[m] < 0){
                        arr[idx++] = A[m];
                        flag = true;
                        break;
                    }
                    m++;
                }
                if (!flag) {
                    arr[idx++] = 0;
                }
                i++;
            }
            j++;
        }
        return arr;
    }
}
