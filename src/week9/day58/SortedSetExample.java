package week9.day58;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(100);
        sortedSet.add(1);

        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());

        Iterator<Integer> iterator = sortedSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
