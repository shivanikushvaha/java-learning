package week4.day26;

public class Test3 {
    public static void main(String[] args) {
        Test3 test = new Test3();
        boolean b = test.m1();
        System.out.println(b);
    }

    private boolean m1() {
        int x = 121;
        char[] charArray = String.valueOf(x).toCharArray();
        for (char c : charArray)
            System.out.println(c);
        int n = charArray.length;
        for (int i = 0; i < n / 2; i++){
            if (!(charArray[i] == charArray[n - i - 1]))
                return false;
        }
        return true;
    }
}
