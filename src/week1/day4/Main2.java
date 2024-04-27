package week1.day4;

public class Main2 {
    public static void main(String[] args) {

        Main2 main2 = new Main2();
        Integer answer = main2.sum(10, 20);
        System.out.println("Answer " + answer);

        Integer answer2 = main2.sum(100, 200);
        System.out.println(answer2);
    }

    public Integer sum(Integer a, Integer b) {
        int c = a + b;
        return c;
    }
}
