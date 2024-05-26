package week4.day22.bridge;

class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("DrawingAPI2 drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }
}