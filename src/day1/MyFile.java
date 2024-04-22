package day1;

public class MyFile {
    public static void main(String[] args){
        String[] strArray = {"AAA", "BBB", "CCC"};
        for (int i = 0; i < strArray.length; i++){
            System.out.println (strArray[i]);
        }
        System.out.println("=========================");

        int[] intArray = {1, 2, 3, 4, 5};
        for (int a = 0; a < intArray.length; a++){
            System.out.println (intArray[a]);
        }
        System.out.println("==========================");

        char[] charArray = {'a', 'b', 'c', 'd'};
        for (int b = 0; b < charArray.length; b++){
            System.out.println (charArray[b]);
        }
    }
}