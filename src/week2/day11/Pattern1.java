package week2.day11;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j < 4; j++) {
            System.out.print("*");
            System.out.print(" ");
        }
    }
}
