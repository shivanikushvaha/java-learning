package week3.day17;

public class Test5 {
    public static void main(String[] args) {
        String str = "malaylam";
        char[] charArray = str.toCharArray();
        int n = charArray.length;
        boolean flag = true;
        for (int i = 0; i < n / 2; i++, n--) {
            if (charArray[i] != charArray[n - 1])
                flag = false;
        }
        System.out.println(flag);
        System.out.println(str.lastIndexOf('m'));
        System.out.println(str.lastIndexOf('m', 3));
        str.contains("m");
    }
}
