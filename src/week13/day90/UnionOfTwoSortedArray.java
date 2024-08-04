package week13.day90;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        int n = 5;
        int m = 5;
        ArrayList<Integer> union = findUnion(arr1, arr2, n, m);
        System.out.println(union);
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i : arr1) sortedSet.add(i);
        for (int i : arr2) sortedSet.add(i);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(sortedSet);
        return arrayList;
    }
}
