package week6.day42;

public class Main2 {
    public static void main(String[] args) {
        int n = 4;
        int k = 5;
        int i = valueAfterKSeconds(n, k);
        System.out.println(i);
    }

    private static int valueAfterKSeconds(int n, int k) {
        int[] temp = new int[n - 1];
        int[] arr = new int[n - 1];
        arr[0] = 1;

        for (int i = 0; i < n - 1; i++) {
            temp[i] = 1;
        }

        int i = 0;
        while (i < k) {
            if (i % 2 == 0) {
                for (int j = 1; j <= n - 1; j++) {
                    arr[j] = temp[j - 1] + temp[j];
                }
            }
            else {
                for (int j = 1; j <= n - 1; j++) {
                    temp[j] = arr[j - 1] + arr[j];
                }
            }

            i++;
        }

        if (k % 2 != 0)
            return arr[n - 1];
        else
            return temp[n - 1];
    }
}
