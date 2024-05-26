package week3.day19.functional;

import java.nio.file.Files;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        Enumeration<Integer> elements = vector.elements();

        ArrayList<Integer> list = Collections.list(elements);
        Set<Object> objects = Collections.emptySet();
        Set<Integer> set = new HashSet<>();
        set.add(10);
        Set<Integer> integers = Collections.synchronizedSet(set);
    }

    public void m1(){
        Consumer1<Integer> consumer1 = (a) -> a.toString();
        consumer1.consume(10);
    }
}
