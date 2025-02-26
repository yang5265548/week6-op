import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(5, 3));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calculator = new Calculator();
        assertEquals(1.6666666666666667, calculator.divide(5, 3));
    }
}