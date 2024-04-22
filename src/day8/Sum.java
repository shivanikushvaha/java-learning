package day8;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println((char) 65);
        Float f = (float) sum/n;
        System.out.println(f);
    }
}
