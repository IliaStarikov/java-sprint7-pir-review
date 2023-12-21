import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
    @Test
    public void shouldCalculateAddition() {
        int value = calculator.calculatePolishNotation("   -20  9   3 2     - *   + ");
        assertEquals(-11, value);
    }
}