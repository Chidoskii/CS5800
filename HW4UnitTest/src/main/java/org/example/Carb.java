package org.example;

import java.util.ArrayList;

public class Carb extends Macros {

    private static Carb instance;

    public static Carb getInstance() {
        if (instance == null) {
            instance = new Carb();
        }
        return instance;
    }

    private final Carbs[] carbsMacros = Carbs.values();

    public ArrayList<String> makeMacroOptions(Diet diet) {
        ArrayList<String> foodItems = new ArrayList<>();
        if (diet == Diet.NO_RESTRICTION) {
            for (Carbs carbmacro  : carbsMacros) {
                foodItems.add(carbmacro.toString());
            }
        }
        if (diet == Diet.PALEO) {
            for (Carbs carbmacro : carbsMacros) {
                if (carbmacro == Carbs.PISTACHIO){
                    foodItems.add(carbmacro.toString());
                }
            }
        }
        if (diet == Diet.VEGAN) {
            for (Carbs carbmacro : carbsMacros) {
                if (carbmacro != Carbs.CHEESE){
                    foodItems.add(carbmacro.toString());
                }
            }
        }
        if (diet == Diet.NUT_ALLERGY) {
            for (Carbs carbmacro : carbsMacros) {
                if (carbmacro != Carbs.PISTACHIO){
                    foodItems.add(carbmacro.toString());
                }
            }
        }

        return foodItems;
    }
}
