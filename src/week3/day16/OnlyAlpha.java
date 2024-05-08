package week3.day16;

public class OnlyAlpha {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] charArray = str.toCharArray();

        boolean flag = true;

        for (char ch : charArray){
            if (!Character.isLetter(ch))
                flag = false;
        }
        System.out.println(flag);
    }
}
