package week4.day27;

public class Main5 {
    public static void main(String[] args) {
        Main5 main5 = new Main5();
        String s = main5.m1("PAYPALISHIRING", 3);
        System.out.println(s);
    }

    private String m1(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder ans = new StringBuilder();
        int diff = 2 * (numRows - 1);
        int diagonalDiff = diff;
        int index;
        int secondIndex;
        int n = s.length();

        for (int i = 0; i < numRows; i++) {
            index = i;

            while (index < n){
                ans.append(s.charAt(index));

                if (i != 0 && i != numRows -1){
                    diagonalDiff = diff - 2 * i;
                    secondIndex = index + diagonalDiff;

                    if (secondIndex < n)
                        ans.append(s.charAt(secondIndex));
                }

                index+=diff;
            }
        }

        return ans.toString();
    }
}
