package week4.day22.bridge;

class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("DrawingAPI1 drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }
}