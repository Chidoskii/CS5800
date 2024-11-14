package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Document document = new Document("test_document");

        document.addLetter('H', "Arial", 12, "black");
        document.addLetter('e', "Arial", 12, "black");
        document.addLetter('l', "Arial", 12, "black");
        document.addLetter('l', "Arial", 12, "black");
        document.addLetter('o', "Arial", 12, "black");
        document.addLetter('W', "Calibri", 14, "blue");
        document.addLetter('o', "Calibri", 14, "blue");
        document.addLetter('r', "Calibri", 14, "blue");
        document.addLetter('l', "Calibri", 14, "blue");
        document.addLetter('d', "Calibri", 14, "blue");
        document.addLetter('C', "Verdana", 16, "red");
        document.addLetter('S', "Verdana", 16, "red");
        document.addLetter('5', "Verdana", 14, "blue");
        document.addLetter('8', "Verdana", 14, "blue");
        document.addLetter('0', "Verdana", 14, "blue");
        document.addLetter('0', "Verdana", 14, "blue");

        System.out.println(document.getTitle());
        document.printDocument();

        String fileName = document.getTitle() + ".txt";
        System.out.println("Writing " + fileName);
        document.saveToFile(fileName);
    }
}