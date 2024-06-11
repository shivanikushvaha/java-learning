package week7.day44;

import java.util.ArrayList;

public class FactorialOfLargeNumber {

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> fact = fact(n);
        System.out.println(fact);
    }

    private static ArrayList<Integer> fact(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int[] arr = new int[n];
        int carry;

        for (int i = 0; i < n; i++)
            arr[i] = i + 1;

        for (int i = 1; i < n; i++) {
            int mul = list.getLast() * arr[i];
            if (mul < 10) {
                list.removeLast();
                list.add(mul);
                carry = 0;
            }
            else {
                list.removeFirst();
                carry = mul / 10;
                list.addFirst(mul % 10);
                // have to multiply with 2 and then add carry
                list.add(carry);
            }

        }
        
        return list;
    }
}
