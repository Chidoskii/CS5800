import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CompleteUnitTest.class, CarbTest.class, FatTest.class, MealPrepTest.class, PizzaBuilderTest.class, ProteinTest.class})
public class CompleteUnitTest {
}
