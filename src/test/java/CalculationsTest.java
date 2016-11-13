import org.junit.*;
import java.util.Random;

public class CalculationsTest {

    private static Random random;
    private int n;

    @BeforeClass
    public static void beforeAllTests() {
        random = new Random();
    }

    @Before
    public void beforeEveryTest() {
        n = random.nextInt(Integer.MAX_VALUE);
    }

    @Test
    public void testSquareShouldReturnZeroWhenZeroPassed() {
        Assert.assertEquals(Calculations.square(0), 0);
    }

    @Test
    public void testSquareShouldReturnCorrectValue() {
        Assert.assertEquals(Calculations.square(n), n * n);
    }

    @After
    public void afterEveryTest(){

    }
}
