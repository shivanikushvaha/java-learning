package week1.day5;

public class Main6 {
    public static void main(String[] args) {
        Main6 main6 = new Main6();
        main6.m1(100);
    }

    public void m1(int a){
        System.out.println("m1 called");
        Integer answer = m2();
        System.out.println(answer);
    }

    public int m2(){
        m3();
        return 100;
    }

    public void m3(){
        System.out.println("m3 called");
    }


}
