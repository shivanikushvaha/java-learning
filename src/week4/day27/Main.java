package week4.day27;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String s = main.m1(58);
        System.out.println(s);
    }

    private String m1(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (num > 0){
            if (num >= values[i]){
                sb.append(romanNumerals[i]);
                num = num - values[i];
            } else i++;
        }

        return sb.toString();
    }
}
