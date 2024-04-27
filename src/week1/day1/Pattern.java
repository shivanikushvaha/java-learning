package week1.day1;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================");

        for (int i = 1; i <= 5; i++) {
            for (int j = i, k = 1; j > 0; j--, k++) {
                System.out.print((char) (64 + k));
            }
            System.out.println();
        }

        System.out.println("=================================");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print((char) (64 + i));
            }
            System.out.println();
        }
    }
}
