package week4.day22.bridge;

abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw(); // Low-level
    public abstract void resizeByPercentage(double pct); // High-level
}