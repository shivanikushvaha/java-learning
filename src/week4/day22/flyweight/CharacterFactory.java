package week4.day22.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class CharacterFactory {
    private Map<java.lang.Character, CharacterFlyweight> characters = new HashMap<>();

    public CharacterFlyweight getCharacter(char symbol) {
        CharacterFlyweight character = characters.get(symbol);
        if (character == null) {
            character = new Character(symbol);
            characters.put(symbol, character);
        }
        return character;
    }
}
