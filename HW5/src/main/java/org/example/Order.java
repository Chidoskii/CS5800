package org.example;

import java.util.ArrayList;

public class Order implements ICalculator{
    private int orderID;
    private String customerName;
    private final ArrayList<FoodItem> foodItems = new ArrayList<>();
    protected ArrayList<Toppings> toppings = new ArrayList<>();

    public Order(int orderID, String customerName) {
        this.orderID = orderID;
        this.customerName = customerName;
    }
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }

    public ArrayList<Menu> getFoodItemName() {
        ArrayList<Menu> menuItems = new ArrayList<>();
        for (FoodItem foodItem : foodItems) {
            menuItems.add(foodItem.getMenuItem());
        }
        return menuItems;
    }

    public void addFoodItems(FoodItem foodItem) {
        foodItems.add(foodItem);
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

    @Override
    public Menu getMenuItem() {
        return null;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public void showFoodItems() {
        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem.getMenuItem());
        }
    }

    @Override
    public double applyLoyaltyDiscount(double price) {
        return 0;
    }

    @Override
    public void orderComplete() {
        foodItems.clear();
        toppings.clear();
    }

    public double calculateOrderTotal() {
        double totalPrice = 0.00;
        for (FoodItem foodItem : foodItems) {
            totalPrice += foodItem.getBasePrice();
        }
        for (Toppings topping : toppings) {
            totalPrice += topping.price;
        }
        return totalPrice;
    }
}
