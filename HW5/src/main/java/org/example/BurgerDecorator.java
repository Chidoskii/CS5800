package org.example;

import java.util.ArrayList;

public class BurgerDecorator extends BaseFoodItemDecorator{
    private Menu menuItem;
    private double basePrice;
    private double totalPrice;
    protected ArrayList<Toppings> toppings = new ArrayList<>();
    public BurgerDecorator(ICalculator wrapped) {
        super(wrapped);
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void addTopping(Toppings topping) {
        toppings.add(topping);
    }

    @Override
    public void setLoyaltyStatus() {
    }

    @Override
    public void incrementTotalTransactions() {

    }

    @Override
    public boolean isLoyal() {
        return false;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    @Override
    public void addFoodItems(FoodItem foodItem) {

    }

    @Override
    public ArrayList<FoodItem> getFoodItems() {
        return null;
    }

    @Override
    public ArrayList<Menu> getFoodItemName() {
        return null;
    }

    @Override
    public String getCustomerName() {
        return "";
    }

    @Override
    public int getOrderID() {
        return 0;
    }

    @Override
    public void setOrderID(int orderID) {

    }

    @Override
    public void setCustomerName(String customerName) {

    }

    @Override
    public Menu getMenuItem() {
        return menuItem;
    }

    @Override
    public double applyLoyaltyDiscount(double price) {
        return 0;
    }

    @Override
    public void orderComplete() {

    }

    @Override
    public double calculateOrderTotal() {
        totalPrice = basePrice + totalPrice;
        for (Toppings topping : toppings) {
            totalPrice += topping.price;
        }
        return totalPrice;
    }
}
