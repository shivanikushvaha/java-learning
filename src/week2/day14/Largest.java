package week2.day14;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 0, 9};
        int largest = arr[0];

        for (Integer i : arr) {
            if(i < largest);
            largest = i;
        }
        System.out.println(largest);
    }
}
