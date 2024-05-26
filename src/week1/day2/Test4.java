package week1.day2;

public class Test4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] i : array) {
            for (int a : i) {
                System.out.println(a);
            }
            System.out.println("=============");

        }

        for (int p = 0; p < array.length; p++) {
            for (int j = 0; j < array[p].length; j++) {
                System.out.println(array[p][j]);
            }
            System.out.println("==========");
        }
    }
}
