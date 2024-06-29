package week9.day60;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {});
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
    }
}
