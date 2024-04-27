package week1.day1;

public class New {
    public static void main(String[] args) {
        String[] strArray = {"AA", "BB", "CC"};
        for (String str : strArray)
            System.out.println(str);

        System.out.println("====================");

        int[] intArray = {1, 2, 3, 4};
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("==================");

        char[] charArray = {'a', 'b', 'c'};
        for (char ch : charArray) {
            System.out.println(ch);
        }
    }
}
