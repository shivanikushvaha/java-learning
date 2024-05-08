package week3.day17;

public class OnlyAlpha {
    public static void main(String[] args) {
        String str = "anksdhjh9";
        char[] charArray = str.toCharArray();
        boolean flag = true;

        for (char ch : charArray)
            if (!Character.isLetter(ch)) {
                flag = false;
            }
        System.out.println(flag);
    }
}
