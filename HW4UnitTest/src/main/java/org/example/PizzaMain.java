package org.example;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Toppings[] myToppings1 = {Toppings.BEEF, Toppings.CHICKEN, Toppings.HAM};
        pizzaBuilder.setChainName("Pizza Hut").setPizzaSize(Sizes.SMALL).setPizzaToppings(myToppings1);
        PizzaChain pizza1 = pizzaBuilder.build();
        pizza1.eatPizza();

        System.out.println();

        Toppings[] myToppings2 = {Toppings.OLIVES, Toppings.PEPPERONI, Toppings.CHICKEN, Toppings.HAM, Toppings.BEEF, Toppings.SPICY_PORK};
        pizzaBuilder.setChainName("Pizza Hut").setPizzaSize(Sizes.MEDIUM).setPizzaToppings(myToppings2);
        PizzaChain pizza2 = pizzaBuilder.build();
        pizza2.eatPizza();

        System.out.println();

        Toppings[] myToppings3 = {Toppings.OLIVES, Toppings.PEPPERONI, Toppings.CHICKEN, Toppings.HAM, Toppings.BEEF, Toppings.SPICY_PORK, Toppings.MUSHROOMS, Toppings.SPINACH, Toppings.EXTRA_CHEESE};
        pizzaBuilder.setChainName("Pizza Hut").setPizzaSize(Sizes.LARGE).setPizzaToppings(myToppings3);
        PizzaChain pizza3 = pizzaBuilder.build();
        pizza3.eatPizza();

        System.out.println();

        Toppings[] phToppings1 = {Toppings.OLIVES, Toppings.PEPPERONI, Toppings.CHICKEN};
        pizzaBuilder.setChainName("Pizza Hut").setPizzaSize(Sizes.LARGE).setPizzaToppings(phToppings1);
        PizzaChain ph_pizza1 = pizzaBuilder.build();
        ph_pizza1.eatPizza();

        System.out.println();

        Toppings[] phToppings2 = {Toppings.PEPPERONI, Toppings.EXTRA_CHEESE};
        pizzaBuilder.setChainName("Pizza Hut").setPizzaSize(Sizes.SMALL).setPizzaToppings(phToppings2);
        PizzaChain ph_pizza2 = pizzaBuilder.build();
        ph_pizza2.eatPizza();

        System.out.println();

        Toppings[] lc_Toppings1 = {Toppings.PEPPERONI, Toppings.CHICKEN, Toppings.HAM, Toppings.BEEF, Toppings.ONIONS, Toppings.MUSHROOMS, Toppings.SPINACH, Toppings.EXTRA_CHEESE};
        pizzaBuilder.setChainName("Little Caesars").setPizzaSize(Sizes.MEDIUM).setPizzaToppings(lc_Toppings1);
        PizzaChain lc_pizza1 = pizzaBuilder.build();
        lc_pizza1.eatPizza();

        System.out.println();

        Toppings[] lc_Toppings2 = {Toppings.OLIVES, Toppings.PEPPERONI, Toppings.CHICKEN, Toppings.HAM, Toppings.SPINACH, Toppings.MUSHROOMS};
        pizzaBuilder.setChainName("Little Caesars").setPizzaSize(Sizes.SMALL).setPizzaToppings(lc_Toppings2);
        PizzaChain lc_pizza2 = pizzaBuilder.build();
        lc_pizza2.eatPizza();

        System.out.println();

        Toppings[] dm_Toppings1 = {Toppings.PEPPERONI};
        pizzaBuilder.setChainName("Domino's").setPizzaSize(Sizes.SMALL).setPizzaToppings(dm_Toppings1);
        PizzaChain dm_pizza1 = pizzaBuilder.build();
        dm_pizza1.eatPizza();

        System.out.println();

        Toppings[] dm_Toppings2 = {Toppings.PEPPERONI, Toppings.CHICKEN, Toppings.HAM};
        pizzaBuilder.setChainName("Domino's").setPizzaSize(Sizes.LARGE).setPizzaToppings(dm_Toppings2);
        PizzaChain dm_pizza2 = pizzaBuilder.build();
        dm_pizza2.eatPizza();

        System.out.println();
    }
}
