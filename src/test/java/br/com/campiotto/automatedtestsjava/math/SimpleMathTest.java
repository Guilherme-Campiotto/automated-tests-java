package br.com.campiotto.automatedtestsjava.math;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.campiotto.math.SimpleMath;

@DisplayName("Test math operations")
public class SimpleMathTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum() {
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double result = math.sum(firstNumber, secondNumber);
        Double expectedResult = 8.2D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test 21 / 3 = 7")
    void testDivision() {
        double firstNumber = 21;
        double secondNumber = 3D;
        Double result = math.division(firstNumber, secondNumber);
        Double expectedResult = 7D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test division by zero")
    void testDivisionByZero() {

        double firstNumber = 1;
        double secondNumber = 0;

        Double result = math.division(firstNumber, secondNumber);

        fail();
    }

    @Test
    @DisplayName("Test 6 - 2 = 4")
    void testSubtraction() {

        double firstNumber = 6D;
        double secondNumber = 2D;
        Double expectedResult = 4D;

        Double result = math.subtraction(firstNumber, secondNumber);
        
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test 5 * 2 = 10")
    void testMultiplication() {
        double firstNumber = 5D;
        double secondNumber = 2D;
        Double result = math.multiplication(firstNumber, secondNumber);
        Double expectedResult = 10D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test (5 + 2) / 2 = 3.5")
    void testMean() {
        double firstNumber = 5D;
        double secondNumber = 2D;
        Double result = math.mean(firstNumber, secondNumber);
        Double expectedResult = 3.5D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test root of 4 = 2")
    void testSquareRoot() {
        double number = 4D;
        Double result = math.squareRoot(number);
        Double expectedResult = 2D;
        Assertions.assertEquals(expectedResult, result, number + " + " + "didn't produce " + expectedResult);
    }
}
