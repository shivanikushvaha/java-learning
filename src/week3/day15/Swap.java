package week3.day15;

public class Swap {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
