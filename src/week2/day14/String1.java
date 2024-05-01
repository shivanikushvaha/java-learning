package week2.day14;

public class String1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "cello";
        System.out.println(str1 + str2);
        String str = str1.concat(str2);
        System.out.println(str);
        System.out.println(str1.compareToIgnoreCase(str2));

        String str3 = "Hello";
        String str4 = "hello";
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

        System.out.println(str3.toLowerCase());
        System.out.println(str3.equals(str4));

        int[] arr = {1, 2, 3, 4, 5};
        int counter = 0;

        char[] charArr = str1.toCharArray();

    }
}
