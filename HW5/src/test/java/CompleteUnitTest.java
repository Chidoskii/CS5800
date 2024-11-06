import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CompleteUnitTest.class, FoodItemTest.class, LoyaltyTest.class, OrderTest.class})
public class CompleteUnitTest {
}
