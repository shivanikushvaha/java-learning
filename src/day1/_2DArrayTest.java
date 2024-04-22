package day1;

public class _2DArrayTest {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {1,2,3}, {1,3,4}};
        for (int[] i : arr){
            for (int a : i){
                System.out.println(a);
            }
            System.out.println("---------------");
        }
        String[][] str = {{"aa", "bb"}, {"kk", "ll"}, {"jj", "hh"}};
        for (String[] a : str) {
            for (String i : a) {
                System.out.println(i);
            }
            System.out.println("-------------");
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("------------------");
        }
        for (int i = 0; i < str.length; i++){
            for (int j = 0; j < str[i].length; j++){
                System.out.println(str[i][j]);
            }
            System.out.println("----------------");
        }
    }
}
