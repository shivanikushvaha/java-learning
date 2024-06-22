package week8.day53;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i : arr)
            i *= 2;

        for (int i : arr)
            System.out.println(i);
    }
}
