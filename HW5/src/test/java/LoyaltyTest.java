import org.example.Loyalty;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyTest {
    Loyalty loyal = new Loyalty(1, "Billy Bob");

    @Test
    public void testIncrementTotalTransactions() {
        int expected = 3;
        loyal.incrementTotalTransactions();
        loyal.incrementTotalTransactions();
        loyal.incrementTotalTransactions();
        int actual = loyal.getTotalTransactions();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetLoyaltyStatus() {
        boolean expected = true;
        loyal.incrementTotalTransactions();
        loyal.incrementTotalTransactions();
        loyal.incrementTotalTransactions();
        loyal.setLoyaltyStatus();
        boolean actual = loyal.isLoyal();
        assertEquals(expected, actual);
    }

    @Test
    public void testApplyLoyaltyDiscount() {
        double price = 15.00;
        double expected = 12.75;
        loyal.incrementTotalTransactions();
        loyal.incrementTotalTransactions();
        loyal.incrementTotalTransactions();
        loyal.setLoyaltyStatus();
        double actual = loyal.applyLoyaltyDiscount(price);
        assertEquals(expected, actual);
    }

}
