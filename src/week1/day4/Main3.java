package week1.day4;

public class Main3 {
    public static void main(String[] args) {
        Main3 main3 = new Main3();
        Integer answer = main3.sum(10, 20);
        System.out.println("Answer" + answer);

        Integer ans = main3.substract(3, 6);
        System.out.println("ANswer" + ans);

        Integer Ans = main3.divide(6, 0);
        System.out.println("Answer" + Ans);

        Integer ans1 = main3.multiply(2, 2);
        System.out.println("Answer" + ans1);
    }

    public Integer sum(Integer a, Integer b) {
        Integer c = a + b;
        return c;
    }

    public Integer substract(Integer x, Integer y) {
        Integer z = x - y;
        return z;
    }

    public Integer divide(Integer p, Integer q) {
        Integer r = p/q;
        return r;
    }

    public Integer multiply(Integer a, Integer b) {
        Integer c = a * b;
        return c;
    }
}

