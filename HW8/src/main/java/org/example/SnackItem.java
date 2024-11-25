package org.example;

public enum SnackItem {
    COKE(2.50),
    PEPSI(1.50),
    CHEETOS(3.00),
    DORITOS(3.00),
    KITKAT(2.00),
    SNICKERS(2.50);


    public final double price;

    private SnackItem(double price) {
        this.price = price;
    }
}
