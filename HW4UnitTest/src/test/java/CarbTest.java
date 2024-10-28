import org.example.Carb;
import org.example.Diet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CarbTest {
    Carb carb = new Carb();

    @Test
    public void testNoRestrictionMakeMacroOptions() {
        String[] expected = new String[] {"CHEESE", "BREAD", "LENTILS", "PISTACHIO"};
        ArrayList<String> Items = new ArrayList<>();
        Items = carb.makeMacroOptions(Diet.NO_RESTRICTION);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPaleoMakeMacroOptions() {
        String[] expected = new String[] {"PISTACHIO"};
        ArrayList<String> Items = new ArrayList<>();
        Items = carb.makeMacroOptions(Diet.PALEO);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testVeganMakeMacroOptions() {
        String[] expected = new String[] {"BREAD", "LENTILS", "PISTACHIO"};
        ArrayList<String> Items = new ArrayList<>();
        Items = carb.makeMacroOptions(Diet.VEGAN);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNutAllergyMakeMacroOptions() {
        String[] expected = new String[] {"CHEESE", "BREAD", "LENTILS"};
        ArrayList<String> Items = new ArrayList<>();
        Items = carb.makeMacroOptions(Diet.NUT_ALLERGY);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

}
