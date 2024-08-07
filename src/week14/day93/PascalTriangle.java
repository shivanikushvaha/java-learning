package week14.day93;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> generate = generate(numRows);
        System.out.println(generate);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int sum;

        for (int i = 1; i <= numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1)
                    innerList.add(1);
                else {
                    sum = list.get(i - 2).get(j - 1) + list.get(i - 2).get(j);
                    innerList.add(sum);
                }
            }
            list.add(innerList);
        }
        return list;
    }
}
