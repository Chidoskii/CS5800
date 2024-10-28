package org.example;

public class PizzaBuilder {
    private String chainName;
    private Sizes pizzaSize;
    private Toppings[] pizzaToppings;

    public PizzaBuilder setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public PizzaBuilder setPizzaSize(Sizes pizzaSize) {
        this.pizzaSize = pizzaSize;
        return this;
    }
    public PizzaBuilder setPizzaToppings(Toppings[] pizzaToppings) {
        this.pizzaToppings = pizzaToppings;
        return this;
    }

    public PizzaChain build() {
        return new PizzaChain(chainName, pizzaSize, pizzaToppings);
    }
}