package day2;

public class Test4 {
    public static void main(String[] args) {
        int[][] Array = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] i : Array) {
            for (int a : i) {
                System.out.println(a);
            }
            System.out.println("=============");

            for (int p = 0; p < Array.length; p++) {
                for (int j = 0; j < Array[p].length; j++) {
                    System.out.println(Array[p][j]);
                }
                System.out.println("==========");
            }
        }
    }
}
