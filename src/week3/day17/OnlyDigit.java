package week3.day17;

public class OnlyDigit {
    public static void main(String[] args) {
        String str = "1244322k0";
        char[] charArray = str.toCharArray();
        boolean flag = true;

        for (char ch : charArray)
            if (!Character.isDigit(ch)) {
                flag = false;
            }
        System.out.println(flag);
    }
}
