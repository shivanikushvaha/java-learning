package week4.day27;

public class Main1 {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        String s = main1.m1("III");
        System.out.println(s);
    }

    private String m1(String s) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
        }
        return sb.toString();
    }
}
