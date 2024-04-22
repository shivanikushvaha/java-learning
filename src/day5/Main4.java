package day5;

public class Main4 {
    public static void main(String[] args) {
        Main4 main4 = new Main4();
        Integer answer = main4.sum(22, 34, 10, 209);
        System.out.println("Anser : " + answer);
    }

    public Integer sum(Integer a, Integer b, Integer c, Integer d) {
        return a + b + c + d;
    }

}
