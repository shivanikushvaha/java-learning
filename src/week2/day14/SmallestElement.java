package week2.day14;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 4, 7, 9};
        int smallest = arr[0];

        for (Integer i : arr){
            if (i < smallest)
                smallest = i;
        }
        System.out.println(smallest);
    }
}
