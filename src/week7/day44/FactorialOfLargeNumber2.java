package week7.day44;

import java.util.ArrayList;

public class FactorialOfLargeNumber2 {
    public static void main(String[] args) {
        int n = 1000;
        ArrayList<Integer> fact = factorial(n);
        System.out.println(fact);
    }

    static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int carry = 0;

        for (int num = 2; num <= n; num++) {
            for (int i = list.size() - 1; i >= 0; i--) {
                int product = (list.get(i) * num) + carry;
                carry = product / 10;
                list.set(i, product % 10);
            }

            while (carry != 0) {
                list.add(0, carry % 10);
                carry = carry / 10;
            }
        }

        return list;
    }
}