package week1.day2;

public class TestPattern {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print((char) (65 + (i - 1)));
            }
            System.out.println();
        }
    }
}
