import org.example.Diet;
import org.example.Fat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FatTest {
    Fat fatty = new Fat();

    @Test
    public void testNoRestrictionMakeMacroOptions() {
        String[] expected = new String[] {"AVOCADO", "SOUR_CREAM", "TUNA", "PEANUTS"};
        ArrayList<String> Items = new ArrayList<>();
        Items = fatty.makeMacroOptions(Diet.NO_RESTRICTION);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPaleoMakeMacroOptions() {
        String[] expected = new String[] {"AVOCADO", "TUNA", "PEANUTS"};
        ArrayList<String> Items = new ArrayList<>();
        Items = fatty.makeMacroOptions(Diet.PALEO);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testVeganMakeMacroOptions() {
        String[] expected = new String[] {"AVOCADO", "PEANUTS"};
        ArrayList<String> Items = new ArrayList<>();
        Items = fatty.makeMacroOptions(Diet.VEGAN);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNutAllergyMakeMacroOptions() {
        String[] expected = new String[] {"AVOCADO", "SOUR_CREAM", "TUNA"};
        ArrayList<String> Items = new ArrayList<>();
        Items = fatty.makeMacroOptions(Diet.NUT_ALLERGY);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
}
