package week4.day25;

public class Test {
    public static void main(String[] args) {
        int i = 1534236469;
        int temp = 0;
        int reverse = 0;
        while (i != 0){
            temp = i % 10;
            reverse = reverse * 10 + temp;
            if (i > Integer.MAX_VALUE && i < Integer.MIN_VALUE)
                System.out.println("ldkfj");
            i/=10;
        }
        System.out.println(reverse);
    }
}
