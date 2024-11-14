package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<String, CharacterType> characterTypes = new HashMap<String, CharacterType>();
    public CharacterFactory() {
        characterTypes = new HashMap<>();
    }
    public CharacterType getCharacterType(String font, int size, String color) {
        String key = font + "_" + size + "_" + color;
        if (!characterTypes.containsKey(key)) {
            characterTypes.put(key, new CharacterType(font, size, color));
        }
        return characterTypes.get(key);
    }
}
