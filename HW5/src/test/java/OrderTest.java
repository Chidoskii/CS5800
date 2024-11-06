import org.example.FoodItem;
import org.example.Menu;
import org.example.Order;
import org.example.Toppings;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Order order = new Order(1, "Billy Bob");
    FoodItem frenchFries = new FoodItem(Menu.FRENCH_FRIES);
    FoodItem burger = new FoodItem(Menu.BURGER);
    FoodItem macaroni = new FoodItem(Menu.MACARONI);
    FoodItem pizza = new FoodItem(Menu.PIZZA);

    @Test
    public void testAddTopping() {
        ArrayList<Toppings> expected = new ArrayList<>();
        expected.add(Toppings.BACON);
        order.addTopping(Toppings.BACON);
        ArrayList<Toppings> actual = order.getToppings();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddFoodItems() {
        ArrayList<FoodItem> expected = new ArrayList<>();
        expected.add(frenchFries);
        order.addFoodItems(frenchFries);
        ArrayList<FoodItem> actual = order.getFoodItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFoodItemName() {
        ArrayList<Menu> expected = new ArrayList<>();
        expected.add(Menu.FRENCH_FRIES);
        expected.add(Menu.BURGER);
        expected.add(Menu.MACARONI);
        order.addFoodItems(frenchFries);
        order.addFoodItems(burger);
        order.addFoodItems(macaroni);
        ArrayList<Menu> actual = order.getFoodItemName();
        assertEquals(expected, actual);
    }
}
