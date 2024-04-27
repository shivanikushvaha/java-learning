package week2.day11;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 5 - i; j > 2; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
