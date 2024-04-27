package week2.day9;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = i, k = 1; j > 0; j--, k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
