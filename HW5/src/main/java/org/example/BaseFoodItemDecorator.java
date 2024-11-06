package org.example;

import java.util.ArrayList;

public abstract class BaseFoodItemDecorator implements ICalculator{
    private final ICalculator wrapped;
    private Menu menuItem;
    private double basePrice;
    private double totalPrice;
    protected ArrayList<Toppings> toppings = new ArrayList<>();

    public BaseFoodItemDecorator(ICalculator wrapped) {
        this.wrapped = wrapped;
    }

    public void setBasePrice(Menu menuItem) {
        this.basePrice = menuItem.price;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public double getTotalPrice() {
        totalPrice = basePrice + totalPrice;
        for (Toppings topping : toppings) {
            totalPrice += topping.price;
        }
        return totalPrice;
    }

    public void add(Toppings topping) {
        toppings.add(topping);
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    @Override
    public double calculateOrderTotal() {
        return wrapped.calculateOrderTotal();
    }
}
