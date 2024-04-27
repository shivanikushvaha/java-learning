package week2.day9;

public class Pattern3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = i, k = 1; j > 0; j--, k++) {
                System.out.print((char) (64 + k));
            }
            System.out.println();
        }
    }
}
