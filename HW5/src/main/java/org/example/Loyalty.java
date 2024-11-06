package org.example;

import java.util.ArrayList;

public class Loyalty extends Order {
    private String customerName;
    private int totalTransactions;
    private boolean loyaltyStatus;

    public Loyalty(int orderID, String customerName) {
        super(orderID, customerName);
    }

    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }
    public void setLoyaltyStatus() {
        if (totalTransactions >= 3) {
            loyaltyStatus = true;
        }
    }
    public boolean isLoyal() {
        return loyaltyStatus;
    }

    public String getCustomerName() {
        return super.getCustomerName();
    }
    public int getTotalTransactions() {
        return totalTransactions;
    }

    public void incrementTotalTransactions() {
        this.totalTransactions++;
    }

    public double applyLoyaltyDiscount(double price) {
        if (loyaltyStatus) {
            price = price * 0.85;
        }
        return price;
    }
}
