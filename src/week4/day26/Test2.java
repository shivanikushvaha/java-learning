package week4.day26;

public class Test2 {
    public static void main(String[] args) {
        Test2 main = new Test2();
        boolean b = main.m1();
        System.out.println(b);
    }

    private boolean m1() {
        String s = "3e+7";

        if (s.trim().length() == 0 || s == null) return false;

        boolean seenD = false;
        boolean seenNum = false;
        boolean seenE = false;

        s = s.trim();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '.':
                    if (seenD || seenNum) return false;
                    seenD = true;
                    break;
                case 'e':
                    if (seenE || !seenNum) return false;
                    seenE = true;
                    seenNum = false;
                    break;
                case 'E':
                    if (seenE || !seenNum) return false;
                    seenE = true;
                    seenNum = false;
                    break;
                case '+':
                case '-':
                    if (i != 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) return false;
                    seenNum = false;
                    break;
                default:
                    if (c - '0' < 0 || c - '0' > 9) return false;
                    seenNum = true;
            }
        }
        return seenNum;
    }

}
