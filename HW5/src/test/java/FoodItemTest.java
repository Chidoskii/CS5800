import org.example.FoodItem;
import org.example.Menu;
import org.example.Toppings;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemTest {
    FoodItem food = new FoodItem(Menu.BURGER);

    @Test
    public void testSetFoodItemPrice() {
        double expected = 6.00;
        double actual = food.getBasePrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddToppings() {
        ArrayList<Toppings> expected = new ArrayList<>() {
            {
                add(Toppings.BACON);
                add(Toppings.CHEESE);
                add(Toppings.KETCHUP);
            }
        } ;
        ArrayList<Toppings> actual = new ArrayList<>() {};
        food.addTopping(Toppings.BACON);
        food.addTopping(Toppings.CHEESE);
        food.addTopping(Toppings.KETCHUP);
        actual = food.getToppings();
        assertEquals(expected, actual);
    }

}
