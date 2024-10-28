package org.example;

import java.util.ArrayList;

public class Protein extends Macros{

    private String proteinName;

    private static Protein instance;

    public static Protein getInstance() {
        if (instance == null) {
            instance = new Protein();
        }
        return instance;
    }

    private final Proteins[] proteinMacros = Proteins.values();
    @Override
    public ArrayList<String> makeMacroOptions(Diet diet) {
        ArrayList<String> foodItems = new ArrayList<>();
        Protein protein = new Protein();
        if (diet == Diet.NO_RESTRICTION) {
            for (Proteins proteinMacro : proteinMacros) {
                foodItems.add(proteinMacro.toString());
            }
        }
        if (diet == Diet.PALEO) {
            for (Proteins proteinMacro : proteinMacros) {
                if (proteinMacro != Proteins.TOFU){
                    foodItems.add(proteinMacro.toString());
                }
            }
        }
        if (diet == Diet.VEGAN) {
            for (Proteins proteinMacro : proteinMacros) {
                if (proteinMacro == Proteins.TOFU){
                    foodItems.add(proteinMacro.toString());
                }
            }
        }
        if (diet == Diet.NUT_ALLERGY) {
            for (Proteins proteinMacro : proteinMacros) {
                foodItems.add(proteinMacro.toString());
            }
        }
//        protein.proteinName = Proteins.CHICKEN.toString();
//        foodItems.add(protein.proteinName);
        return foodItems;
    }
}
