package week3.day17;

public class LauncherDemo {
    static void main1(String[] args) {
        System.out.println("static, args");
    }

    static void main2() {
        System.out.println("static, no args");
    }

    void main3(String[] args) {
        System.out.println("instance, args");
    }

    void main4() {
        System.out.println("instance, no args");
    }
}