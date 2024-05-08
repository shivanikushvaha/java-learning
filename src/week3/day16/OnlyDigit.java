package week3.day16;

public class OnlyDigit {
    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!Character.isDigit('1'));

        String str = "1234a";
        char[] charArray = str.toCharArray();
        boolean flag = true;
        for (char ch : charArray){
            if (!Character.isDigit(ch)) {
                flag = false;
            }
        }
        System.out.println(flag);

    }
}
