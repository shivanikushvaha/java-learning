package week13.day90;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 10, -1, 0, 0, 1, 1, 0};
        int elementToRemove = 1;

        int[] result = IntStream.of(nums)
                                .filter(num -> num != elementToRemove)
                                .toArray();

        System.out.println("Array after removal: " + Arrays.toString(result));
    }
}
