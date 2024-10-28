package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MacrosMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Ricky Bobby", Diet.NO_RESTRICTION);
        customer1.getMealPlan();

        Customer customer2 = new Customer("Billy Jean", Diet.PALEO);
        customer2.getMealPlan();

        Customer customer3 = new Customer("Donny Darko", Diet.VEGAN);
        customer3.getMealPlan();

        Customer customer4 = new Customer("Will Ferrell", Diet.NUT_ALLERGY);
        customer4.getMealPlan();

        Customer customer5 = new Customer("William Dafoe", Diet.PALEO);
        customer5.getMealPlan();

        Customer customer6 = new Customer("James Bond", Diet.NO_RESTRICTION);
        customer6.getMealPlan();
    }
}
