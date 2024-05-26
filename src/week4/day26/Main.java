package week4.day26;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        boolean b = main.m1();
        System.out.println(b);
    }

    public boolean m1() {
        String s = "0e";

        char[] charArray = s.trim().toCharArray();

        if (charArray[0] == 'e' || charArray[0] == 'E')
            return false;

        if (charArray.length >= 2 && (charArray[0] == '0') && (charArray[1] == 'e' || charArray[1] == 'E'))
            return false;

        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                if (s.length() > 1 && (charArray[i] == 'e' || charArray[i] == 'E' || charArray[i] == '.'))
                    continue;
                return false;
            }
        }
        return true;
    }
}
