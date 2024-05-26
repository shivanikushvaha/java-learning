package week3.day17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test8 {

    private static final String TEXT_1 = "Illinois";
    private static final String TEXT_2 = "Mathematics";
    private static final String TEXT_3 = "and";
    private static final String TEXT_4 = "Science";
    private static final String TEXT_5 = "Academy";

    public static void main(String[] args) {
        String join = String.join(" ", TEXT_1, TEXT_2, TEXT_3);
        System.out.println(join);

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(TEXT_1).append(" ").append(TEXT_2);
        System.out.println(append);

        String[] arr = {TEXT_1, TEXT_2, TEXT_3};
        String collect = Arrays.stream(arr, 0, arr.length).collect(Collectors.joining(String.valueOf(' ')));
        System.out.println(collect);

    }
}
