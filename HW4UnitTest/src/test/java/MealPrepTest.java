import org.example.MealPrep;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MealPrepTest {
    MealPrep chef = new MealPrep();

    @Test
    public void testPrepareMeal() {
        ArrayList<String> expectedProteins = new ArrayList<>();
        expectedProteins.add("FISH");
        expectedProteins.add("CHICKEN");
        expectedProteins.add("BEEF");
        expectedProteins.add("TOFU");
        ArrayList<String> expectedCarbs = new ArrayList<>();
        expectedCarbs.add("CHEESE");
        expectedCarbs.add("BREAD");
        expectedCarbs.add("LENTILS");
        expectedCarbs.add("PISTACHIO");
        ArrayList<String> expectedFats = new ArrayList<>();
        expectedFats.add("AVOCADO");
        expectedFats.add("SOUR_CREAM");
        expectedFats.add("TUNA");
        expectedFats.add("PEANUTS");

        ArrayList<String> meal = chef.prepareMeal(expectedProteins, expectedCarbs, expectedFats);

        String actualProtein = meal.get(0);
        String actualCarb = meal.get(1);
        String actualFat = meal.get(2);

        assertTrue(expectedProteins.contains(actualProtein));
        assertTrue(expectedCarbs.contains(actualCarb));
        assertTrue(expectedFats.contains(actualFat));
    }
}
