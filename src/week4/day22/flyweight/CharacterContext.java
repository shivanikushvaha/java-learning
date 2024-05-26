package week4.day22.flyweight;

// Context
public class CharacterContext {
    private int x;
    private int y;

    public CharacterContext(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
