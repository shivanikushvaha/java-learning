package week1.day2;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
        public static void main(String[] args) {
            Set<String> set = new HashSet<>();
            set.add("AAA");
            set.add("BBB");
            set.add("CCC");
            set.add("DDD");
            set.add("EEE");

            System.out.println(set.remove("CCC"));
            System.out.println(set.size());
            System.out.println(set.isEmpty());
            System.out.println(set.contains("FFF"));

            System.out.println(set);

            set.clear();
            System.out.println(set.isEmpty());
            System.out.println(set.size());
        }
}
