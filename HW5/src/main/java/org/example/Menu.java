package org.example;

public enum Menu {
    BURGER(6.00),
    HOT_DOG(4.00),
    PIZZA(7.00),
    FRENCH_FRIES(3.50),
    MACARONI(5.00);

    final double price;

    Menu (double price) {
        this.price = price;
    }


}
