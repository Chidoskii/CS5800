import org.example.Diet;
import org.example.Protein;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProteinTest {
    Protein proto = new Protein();

    @Test
    public void testNoRestrictionMakeMacroOptions() {
        String[] expected = new String[] {"FISH", "CHICKEN", "BEEF", "TOFU"};
        ArrayList<String> Items = new ArrayList<>();
        Items = proto.makeMacroOptions(Diet.NO_RESTRICTION);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPaleoMakeMacroOptions() {
        String[] expected = new String[] {"FISH", "CHICKEN", "BEEF"};
        ArrayList<String> Items = new ArrayList<>();
        Items = proto.makeMacroOptions(Diet.PALEO);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testVeganMakeMacroOptions() {
        String[] expected = new String[] {"TOFU"};
        ArrayList<String> Items = new ArrayList<>();
        Items = proto.makeMacroOptions(Diet.VEGAN);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNutAllergyMakeMacroOptions() {
        String[] expected = new String[] {"FISH", "CHICKEN", "BEEF", "TOFU"};
        ArrayList<String> Items = new ArrayList<>();
        Items = proto.makeMacroOptions(Diet.NUT_ALLERGY);
        String[] actual = Items.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
}
