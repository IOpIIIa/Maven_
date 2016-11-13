
public class Main {
    public static void main(String[] args) {
        testSquareShouldReturnZeroWhenZeroPassed();

        testSquareShouldWork();
    }

    public static void testSquareShouldReturnZeroWhenZeroPassed() {
        System.out.println("Square Should Return Zero When Zero Passed");
        System.out.println(Calculations.square(0) == 0);
    }

    public static void testSquareShouldWork() {
        System.out.println("Square Should Work");
        System.out.println(Calculations.square(1) == 1);
        System.out.println(Calculations.square(2) == 4);
    }
}
