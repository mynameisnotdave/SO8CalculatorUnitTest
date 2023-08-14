import org.junit.jupiter.api.*;



class CalculatorTest {

    @Test
    void Add() {
        var calculator = new Calculator();
        Assertions.assertEquals(10, calculator.Add(4,6));
    }
    @Test
    void SquareOfNumber() {
        var calculator = new Calculator();
        Assertions.assertEquals(16, calculator.SquareOfNumber(4));
    }

    @Test
    void FindLowerBoundOfDec() {
        var calculator = new Calculator();
        Assertions.assertNotEquals(9, calculator.FindLowerBoundOfDec(8.1));
    }
}