package week3.day18;

public class Main {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();  // The proxy controls access to the RealSubject
    }
}
