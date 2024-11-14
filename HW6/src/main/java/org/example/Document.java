package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private String title;
    private List<Letter> letters;
    private CharacterFactory characterFactory;

    public Document(String title) {
        this.title = title;
        this.letters = new ArrayList<Letter>();
        this.characterFactory = new CharacterFactory();
    }

    public String getTitle() {
        return title;
    }

    public void addLetter(char letter, String font, int size, String color) {
        CharacterType properties = characterFactory.getCharacterType(font, size, color);
        Letter letterCharacter = new Letter(letter, properties);
        letters.add(letterCharacter);
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Letter letter : letters) {
                writer.write(letter.getCharacter());
            }
            writer.newLine();
        }
    }

    public void loadFromFile(String filename) throws IOException {
        letters.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                char letter = parts[0].charAt(0);
                addLetter(letter, "Arial", 12, "black");
            }
        }
    }

    public void printDocument() {
        for (Letter letter : letters) {
            System.out.print(letter.getCharacter());
        }
        System.out.println();
    }

}
