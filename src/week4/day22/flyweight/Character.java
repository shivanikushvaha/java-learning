package week4.day22.flyweight;

// ConcreteFlyweight
public class Character implements CharacterFlyweight {
    private final char symbol;

    public Character(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(CharacterContext context) {
        System.out.println("Character: " + symbol + " at position (" + context.getX() + ", " + context.getY() + ")");
    }
}
