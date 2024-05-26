package week4.day22.bridge;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new CircleShape(1, 2, 3, new DrawingAPI1());
        Shape circle2 = new CircleShape(5, 7, 11, new DrawingAPI2());

        circle1.draw();
        circle2.draw();

        circle1.resizeByPercentage(50);
        circle2.resizeByPercentage(25);

        circle1.draw();
        circle2.draw();
    }
}
