package week3.day16;

public class Swap {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;
        System.out.println(a + " " + b);

        b = b - a;
        a = a + b;
        b = a - b;

        System.out.println(a + " " + b);
    }
}
