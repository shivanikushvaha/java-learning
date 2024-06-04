package week6.day36;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> l = new ArrayList<>();
            int k = 0;
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1)
                    l.add(1);
                else
                    l.add(lists.get(i - 2).get(k) + lists.get(i - 2).get(++k));
            }
            lists.add(l);
        }
        return lists;
    }
}
