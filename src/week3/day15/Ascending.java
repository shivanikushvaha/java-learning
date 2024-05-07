package week3.day15;

public class Ascending {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 10, 11};

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
