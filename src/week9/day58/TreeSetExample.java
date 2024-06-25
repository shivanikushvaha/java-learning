package week9.day58;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(100);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.tailSet(1));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(90));
    }
}
