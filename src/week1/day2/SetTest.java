package week1.day2;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);
        System.out.println(integerSet.remove(20));
        System.out.println(integerSet.contains(30));
        System.out.println(integerSet.isEmpty());
        System.out.println(integerSet);
//        integerSet.clear();
//        System.out.println(integerSet.isEmpty());

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");

        for (Integer i : integerSet) {
            System.out.println(i);
        }

    }
}
