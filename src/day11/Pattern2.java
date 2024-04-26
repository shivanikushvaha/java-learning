package day11;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();

        }

            for (int i1 = 0; i1 < 2; i1++) {
                for (int j1 = 0; j1 <= i1; j1++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= 2 - i1; k++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }

    }
}