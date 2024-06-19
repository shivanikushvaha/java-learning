package week7.day48;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Test3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(10);
        arrayDeque.push(20);
        arrayDeque.push(1);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);


    }
}
