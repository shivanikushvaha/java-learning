package week3.day15;

public class Swap2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        b = b - a;
        a = a + b;
        b = a - b;
        System.out.println(a + " " + b);
    }
}
