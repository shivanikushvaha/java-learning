package week4.day25;

public class Test3 {
    public static void main(String[] args) {
        String s = "91283472332";
        s = s.trim();

        long number = Long.parseLong(s);
        if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
            System.out.println("Number out of range for int: " + number);
        }

        String str = "a1";
        System.out.println(str.substring(1, 2));
    }
}
