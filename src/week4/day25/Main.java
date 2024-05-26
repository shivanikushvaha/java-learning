package week4.day25;

public class Main {
    public static void main(String[] args) {
        Integer j = 123;
        char[] charArray = String.valueOf(j).toCharArray();
        int n = charArray.length;
        int[] arr = new int[n];
        for (int i = n, k = 0; i > 0; i--, k++){
            arr[k] = charArray[i - 1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : arr){
            stringBuilder.append((char) a);
        }
        int i = Integer.parseInt(stringBuilder.toString());
        System.out.println(i);
    }
}
