package week4.day26;

public class Test4 {
    public static void main(String[] args) {
        Test4 test4 = new Test4();
        boolean b = test4.m1(121);
        System.out.println(b);
    }

    private boolean m1(int x) {
        if (x < 0) return false;

        int reverse = 0;
        int temp = x;

        while (temp != 0){
            int digit = temp % 10;
            reverse = reverse  * 10 + digit;
            temp/=10;
        }
        return (reverse == x);
    }
}
