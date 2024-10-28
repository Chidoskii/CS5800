package org.example;

import java.util.Arrays;

public class PizzaChain {
    protected String chainName;
    protected Sizes pizzaSize;
    protected Toppings[] pizzaToppings;

    public String getChainName() {
        return chainName;
    }

    public Sizes getPizzaSize() {
        return pizzaSize;
    }

    public Toppings[] getPizzaToppings() {
        return pizzaToppings;
    }

    public PizzaChain(String chainName, Sizes pizzaSize, Toppings[] pizzaToppings) {
        this.chainName = chainName;
        this.pizzaSize = pizzaSize;
        this.pizzaToppings = pizzaToppings;
    }

    public void eatPizza() {
        System.out.println("Pizza Chain: " + chainName);
        System.out.println("Pizza Size: " + pizzaSize);
        System.out.println("Pizza Toppings: " + Arrays.toString(pizzaToppings));
    }
}
