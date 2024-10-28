package org.example;

import java.util.ArrayList;
import java.util.Random;

public class MealPrep implements Meals{

    private static MealPrep instance;

    public static MealPrep getInstance() {
        if (instance == null) {
            instance = new MealPrep();
        }
        return instance;
    }

    @Override
    public ArrayList<String> prepareMeal(ArrayList<String> proteins, ArrayList<String> carbs, ArrayList<String> fats) {
        ArrayList<String> meal = new ArrayList<>();
        String protein = "";
        String carb = "";
        String fat = "";
        Random rand = new Random();
        int randomIndex = rand.nextInt(proteins.size());
        protein = proteins.get(randomIndex);
        meal.add(protein);
        randomIndex = rand.nextInt(carbs.size());
        carb = carbs.get(randomIndex);
        meal.add(carb);
        randomIndex = rand.nextInt(fats.size());
        fat = fats.get(randomIndex);
        meal.add(fat);

        return meal;
    }
}
