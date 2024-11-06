package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int orderNumber = 1;
        double price;
        ArrayList<Toppings> myToppings;
        ArrayList<Menu> myFoodNames;
        String orderID;
        String formattedNumber;

        ICalculator loyal2 = new Loyalty(orderNumber,"Bob");
        FoodItem baconBurger = new FoodItem(Menu.BURGER);
        baconBurger.addTopping(Toppings.BACON);
        loyal2.addTopping(Toppings.BACON);
        baconBurger.addTopping(Toppings.CHEESE);
        loyal2.addTopping(Toppings.CHEESE);
        baconBurger.addTopping(Toppings.ONIONS);
        loyal2.addTopping(Toppings.ONIONS);
        FoodItem macaroni = new FoodItem(Menu.MACARONI);
        macaroni.addTopping(Toppings.CHEESE);
        loyal2.addFoodItems(baconBurger);
        loyal2.addFoodItems(macaroni);
        price = loyal2.calculateOrderTotal();
        if (loyal2.isLoyal()) {
            price = loyal2.applyLoyaltyDiscount(price);
        }
        formattedNumber = String.format("%.2f", price);
        myFoodNames = loyal2.getFoodItemName();
        myToppings = loyal2.getToppings();
        orderID = Integer.toString(loyal2.getOrderID());
        System.out.println("------------------ Order " + orderID + " ----------------");
        System.out.println("Customer: " + loyal2.getCustomerName() + "\tLoyalty: " + loyal2.isLoyal());
        System.out.println("You ordered: " + myFoodNames);
        System.out.println("Your Toppings: " + myToppings);
        System.out.println("Total: $" + formattedNumber);
        loyal2.incrementTotalTransactions();
        loyal2.setLoyaltyStatus();
        loyal2.orderComplete();
        orderNumber++;

        loyal2.setOrderID(orderNumber);
        FoodItem cheeseBurger = new FoodItem(Menu.BURGER);
        cheeseBurger.addTopping(Toppings.CHEESE);
        loyal2.addTopping(Toppings.CHEESE);
        cheeseBurger.addTopping(Toppings.ONIONS);
        loyal2.addTopping(Toppings.ONIONS);
        FoodItem hotDog = new FoodItem(Menu.HOT_DOG);
        hotDog.addTopping(Toppings.KETCHUP);
        loyal2.addFoodItems(cheeseBurger);
        loyal2.addFoodItems(hotDog);
        price = loyal2.calculateOrderTotal();
        if (loyal2.isLoyal()) {
            price = loyal2.applyLoyaltyDiscount(price);
        }
        formattedNumber = String.format("%.2f", price);
        myFoodNames = loyal2.getFoodItemName();
        myToppings = loyal2.getToppings();
        orderID = Integer.toString(loyal2.getOrderID());
        System.out.println("------------------ Order " + orderID + " ----------------");
        System.out.println("Customer: " + loyal2.getCustomerName() + "\tLoyalty: " + loyal2.isLoyal());
        System.out.println("You ordered: " + myFoodNames);
        System.out.println("Your Toppings: " + myToppings);
        System.out.println("Total: $" + formattedNumber);
        loyal2.incrementTotalTransactions();
        loyal2.setLoyaltyStatus();
        loyal2.orderComplete();
        orderNumber++;

        loyal2.setOrderID(orderNumber);
        FoodItem pizza = new FoodItem(Menu.PIZZA);
        pizza.addTopping(Toppings.CHEESE);
        loyal2.addTopping(Toppings.CHEESE);
        pizza.addTopping(Toppings.ONIONS);
        loyal2.addTopping(Toppings.ONIONS);
        FoodItem fries = new FoodItem(Menu.FRENCH_FRIES);
        fries.addTopping(Toppings.KETCHUP);
        loyal2.addFoodItems(pizza);
        loyal2.addFoodItems(fries);
        price = loyal2.calculateOrderTotal();
        if (loyal2.isLoyal()) {
            price = loyal2.applyLoyaltyDiscount(price);
        }
        formattedNumber = String.format("%.2f", price);
        myFoodNames = loyal2.getFoodItemName();
        myToppings = loyal2.getToppings();
        orderID = Integer.toString(loyal2.getOrderID());
        System.out.println("------------------ Order " + orderID + " ----------------");
        System.out.println("Customer: " + loyal2.getCustomerName() + "\tLoyalty: " + loyal2.isLoyal());
        System.out.println("You ordered: " + myFoodNames);
        System.out.println("Your Toppings: " + myToppings);
        System.out.println("Total: $" + formattedNumber);
        loyal2.incrementTotalTransactions();
        loyal2.setLoyaltyStatus();
        loyal2.orderComplete();
        orderNumber++;

        loyal2.setOrderID(orderNumber);
        FoodItem cheeseBurger2 = new FoodItem(Menu.BURGER);
        cheeseBurger2.addTopping(Toppings.CHEESE);
        loyal2.addTopping(Toppings.CHEESE);
        FoodItem chiliCheeseFries = new FoodItem(Menu.FRENCH_FRIES);
        chiliCheeseFries.addTopping(Toppings.CHILI);
        loyal2.addTopping(Toppings.CHILI);
        chiliCheeseFries.addTopping(Toppings.CHEESE);
        loyal2.addTopping(Toppings.CHEESE);
        loyal2.addFoodItems(cheeseBurger2);
        loyal2.addFoodItems(chiliCheeseFries);
        price = loyal2.calculateOrderTotal();
        if (loyal2.isLoyal()) {
            price = loyal2.applyLoyaltyDiscount(price);
        }
        formattedNumber = String.format("%.2f", price);
        myFoodNames = loyal2.getFoodItemName();
        myToppings = loyal2.getToppings();
        orderID = Integer.toString(loyal2.getOrderID());
        System.out.println("------------------ Order " + orderID + " ----------------");
        System.out.println("Customer: " + loyal2.getCustomerName() + "\tLoyalty: " + loyal2.isLoyal());
        System.out.println("You ordered: " + myFoodNames);
        System.out.println("Your Toppings: " + myToppings);
        System.out.println("Total: $" + formattedNumber);
        loyal2.incrementTotalTransactions();
        loyal2.setLoyaltyStatus();
        loyal2.orderComplete();
    }
}