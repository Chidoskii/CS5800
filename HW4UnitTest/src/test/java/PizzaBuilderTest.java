import org.example.PizzaBuilder;
import org.example.PizzaChain;
import org.example.Sizes;
import org.example.Toppings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaBuilderTest {
    PizzaBuilder pizzaBuilder = new PizzaBuilder();

    @Test
    public void testBuild() {
        Toppings[] myToppings = {Toppings.BEEF, Toppings.CHICKEN, Toppings.HAM};
        PizzaChain expected = new PizzaChain("Domino's", Sizes.SMALL, myToppings);
        pizzaBuilder.setChainName("Domino's").setPizzaSize(Sizes.SMALL).setPizzaToppings(myToppings);
        PizzaChain actual = pizzaBuilder.build();
        assertEquals(expected.getChainName(), actual.getChainName());
        assertEquals(expected.getPizzaSize(), actual.getPizzaSize());
        assertEquals(expected.getPizzaToppings(), actual.getPizzaToppings());
    }
}
