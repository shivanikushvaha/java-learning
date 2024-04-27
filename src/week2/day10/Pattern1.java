package week2.day10;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.println();

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");

            }
        }
        System.out.println();

        String str = """
                       *
                      * *
                     * * *
                    * * * *
                    """;
        System.out.println(str);
    }
}
