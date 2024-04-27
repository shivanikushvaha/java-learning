package week2.day9;

public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--)  {
            for (int j = i; j > 0; j--) {
                System.out.print((char) (64 + i));
            }
            System.out.println();
        }
    }
}
