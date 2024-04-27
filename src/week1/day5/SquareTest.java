package week1.day5;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest square = new SquareTest();
        Integer ans = square.square(3);
        Integer a = ans + 10;
        System.out.println(square.square(10) + 10);

        int sum = SquareTest.sum(10, 20);
        System.out.println(sum);
    }

    public Integer square(Integer a) {
        return a * a;
    }

    public static int sum(int a, int b){
        return a + b;
    }

}
