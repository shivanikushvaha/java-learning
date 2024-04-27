package week1.day1;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("DDD");
        set.add("AAA");
        System.out.println(set.size());

        System.out.println(set.remove("AAA"));

        System.out.println(set.isEmpty());
        System.out.println(set);

        System.out.println(set.contains("AAA"));
        System.out.println(set.contains("ZZZ"));

        set.clear();
        System.out.println("+++++++++++++++++++");

        System.out.println(set);
        System.out.println(set.isEmpty());

        System.out.println(set.size());
    }
}
