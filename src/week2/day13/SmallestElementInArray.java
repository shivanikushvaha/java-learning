package week2.day13;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 6, 10};
        int smallest = arr[0];

        for (Integer i : arr){
            if (i < smallest) // 4 > 2
                smallest = i;
        }
        System.out.println(smallest);
    }
}
