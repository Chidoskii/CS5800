package org.example;

import java.util.ArrayList;

public class Customer {
    private String name;
    private Diet dietPlan;

    public void setName(String name) {
        this.name = name;
    }
    public void setDietPlan(Diet dietPlan) {
        this.dietPlan = dietPlan;
    }
    public String getName() {
        return name;
    }
    public Diet getDietPlan() {
        return dietPlan;
    }

    public Customer(String customerName,Diet dietPlan) {
        this.name = customerName;
        this.dietPlan = dietPlan;
    }

    public void getMealPlan() {
        Diet myDietPlan = dietPlan;

        ArrayList<String> proteins;
        Protein proto = Protein.getInstance();
        proteins = proto.makeMacroOptions(myDietPlan);

        ArrayList<String> carbs;
        Carb carbo = Carb.getInstance();
        carbs = carbo.makeMacroOptions(myDietPlan);

        ArrayList<String> fats;
        Fat fatty = Fat.getInstance();
        fats = fatty.makeMacroOptions(myDietPlan);

        ArrayList<String> mealPlan;
        MealPrep chef = MealPrep.getInstance();
        mealPlan = chef.prepareMeal(proteins, carbs, fats);

        System.out.println("Customer Name: " + name);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Meal Plan: " + mealPlan);
        System.out.println();
    }
}
