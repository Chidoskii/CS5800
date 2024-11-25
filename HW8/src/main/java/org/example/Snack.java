package org.example;

public class Snack {
    private SnackItem snackItem;
    private int quantity;
    private double price;

    public Snack(SnackItem snackItem, int quantity) {
        this.snackItem = snackItem;
        this.quantity = quantity;
        price = snackItem.price;
    }
    public SnackItem getSnackItem() {
        return snackItem;
    }
    public void setSnackItem(SnackItem snackItem) {
        this.snackItem = snackItem;
    }
    public double getSnackItemPrice() {
        return snackItem.price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void decrementQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice() {
        this.price = getSnackItemPrice();
    }
}
