package org.example;

public class Letter implements Character {
    private final char character;
    private final CharacterType properties;

    public Letter(char character, CharacterType properties) {
        this.character = character;
        this.properties = properties;
    }

    @Override
    public String getFont() {
        return properties.getFont();
    }

    public char getCharacter() {
        return character;
    }

    public CharacterType getProperties() {
        return properties;
    }

}
