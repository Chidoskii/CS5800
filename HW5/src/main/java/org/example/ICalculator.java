package org.example;

import java.util.ArrayList;

public interface ICalculator {

    public ArrayList<Toppings> getToppings();
    public ArrayList<FoodItem> getFoodItems();
    public ArrayList<Menu> getFoodItemName();
    public String getCustomerName();
    public int getOrderID();
    public void setOrderID(int orderID);
    public void setCustomerName(String customerName);
    public void addTopping(Toppings topping);
    public void setLoyaltyStatus();
    public void incrementTotalTransactions();
    public boolean isLoyal();
    public void addFoodItems(FoodItem foodItem);
    public Menu getMenuItem();
    public double applyLoyaltyDiscount(double price);
    public void orderComplete();

    default double calculateOrderTotal() {
        return 0;
    };
}
