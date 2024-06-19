package week7.day47;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;
        int r1 = (a | b) ^ c;
        int r2 = (a & b);
        String binaryString = Integer.toBinaryString(r1);
        int count = 0;

        for (char ch : binaryString.toCharArray()) {
            if (ch == '1')
                count++;
        }

        int r = r1 & r2;
        String binaryString1 = Integer.toBinaryString(r);

        for (char ch : binaryString1.toCharArray()) {
            if (ch == '1')
                count++;
        }
        System.out.println(count);
    }
}
