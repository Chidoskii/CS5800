package org.example;

import java.util.ArrayList;

public class Fat extends Macros {
    private static Fat instance;

    public static Fat getInstance() {
        if (instance == null) {
            instance = new Fat();
        }
        return instance;
    }

    private final Fats[] fatsMacros = Fats.values();

    public ArrayList<String> makeMacroOptions(Diet diet) {
        ArrayList<String> foodItems = new ArrayList<>();
        if (diet == Diet.NO_RESTRICTION) {
            for (Fats fatMacro  : fatsMacros) {
                foodItems.add(fatMacro.toString());
            }
        }
        if (diet == Diet.PALEO) {
            for (Fats fatMacro : fatsMacros) {
                if (fatMacro != Fats.SOUR_CREAM){
                    foodItems.add(fatMacro.toString());
                }
            }
        }
        if (diet == Diet.VEGAN) {
            for (Fats fatMacro : fatsMacros) {
                if (fatMacro != Fats.SOUR_CREAM && fatMacro != Fats.TUNA){
                    foodItems.add(fatMacro.toString());
                }
            }
        }
        if (diet == Diet.NUT_ALLERGY) {
            for (Fats fatMacro : fatsMacros) {
                if (fatMacro != Fats.PEANUTS){
                    foodItems.add(fatMacro.toString());
                }
            }
        }

        return foodItems;
    }
}
