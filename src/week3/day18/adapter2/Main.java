package week3.day18.adapter2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int celciusTemp = 20;
        int fer = (9/5) * (celciusTemp) + 32;
        System.out.println(fer);

        int k = 273 + celciusTemp;
        System.out.println(k);

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector);
        Enumeration<Integer> elements = vector.elements();

        ArrayList<Integer> list = Collections.list(elements);

        List<Integer> list1 = Arrays.asList(1, 2, 3);

        System.out.println(2.0 % 0);
        System.out.println(0.0 / 0);
        System.out.println(Math.sqrt(-1));

        int[][] arr = new int[2][];

    }
}
