package day1;

public class Count {
    public static void main(String[] args) {
        String[] strArray = {"AAA", "BBB", "CCC"};
        int count = 0;
        for (String str : strArray) {
            count++;
        }
        System.out.println(count);
    }
}
