package week10.day69;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        Integer pop = stack.pop();
        System.out.println(pop);
    }
}
