package org.example;

public enum Toppings {
    CHEESE(1.00),
    MUSHROOMS(2.00),
    KETCHUP(0.50),
    CHILI(1.50),
    MAYONNAISE(0.50),
    MUSTARD(0.50),
    ONIONS(1.00),
    BACON(2.00),
    BARBECUE_SAUCE(0.50),
    OLIVES(1.00);

    final double price;

    Toppings(double price) {
        this.price = price;
    }
}
