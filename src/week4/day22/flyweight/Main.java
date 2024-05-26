package week4.day22.flyweight;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String document = "Hello World";

        int x = 0;
        int y = 0;

        for (char c : document.toCharArray()) {
            CharacterFlyweight character = factory.getCharacter(c);
            CharacterContext context = new CharacterContext(x++, y);
            character.display(context);
        }
    }
}
