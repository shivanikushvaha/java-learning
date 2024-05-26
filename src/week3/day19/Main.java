package week3.day19;

public class Main {
    public static void main(String[] args) {
        MyInterface obj = (a) -> System.out.println("Hello World!");
        obj.myMethod(10);

        MyInterface myInterface = new MyClass();
        myInterface.myMethod(100);

    }
}
