package week3.day19.composite;

public class Main {
    public static void main(String[] args) {
        Graphic circle1 = new Circle();
        Graphic circle2 = new Circle();
        Graphic square1 = new Square();

        CompositeGraphic composite1 = new CompositeGraphic();
        CompositeGraphic composite2 = new CompositeGraphic();

        composite1.add(circle1);
        composite1.add(square1);

        composite2.add(circle2);
        composite2.add(composite1);

        System.out.println("Drawing composite1:");
        composite1.draw();

        System.out.println("\nDrawing composite2:");
        composite2.draw();
    }
}
