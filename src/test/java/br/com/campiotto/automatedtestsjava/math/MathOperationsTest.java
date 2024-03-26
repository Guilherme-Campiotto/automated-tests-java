package br.com.campiotto.automatedtestsjava.math;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import br.com.campiotto.math.MathOperations;

@DisplayName("Test math operations")
public class MathOperationsTest {

    MathOperations math;

    @BeforeEach
    void beforeEachMethod() {
        math = new MathOperations();
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testSum() {
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double result = math.sum(firstNumber, secondNumber);
        Double expectedResult = 8.2D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test 21 / 3 = 7")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testDivision() {
        double firstNumber = 21;
        double secondNumber = 3D;
        Double result = math.division(firstNumber, secondNumber);
        Double expectedResult = 7D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test division by zero")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testDivisionByZero() {

        double firstNumber = 1;
        double secondNumber = 0;

        Assertions.assertThrows(ArithmeticException.class, () ->  {
            math.division(firstNumber, secondNumber);
        }, () -> "Should throw ArithmeticException");

    }

    @Test
    @DisplayName("Test 6 - 2 = 4")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testSubtraction() {

        double firstNumber = 6D;
        double secondNumber = 2D;
        Double expectedResult = 4D;

        Double result = math.subtraction(firstNumber, secondNumber);
        
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test 5 * 2 = 10")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testMultiplication() {
        double firstNumber = 5D;
        double secondNumber = 2D;
        Double result = math.multiplication(firstNumber, secondNumber);
        Double expectedResult = 10D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test (5 + 2) / 2 = 3.5")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testMean() {
        double firstNumber = 5D;
        double secondNumber = 2D;
        Double result = math.mean(firstNumber, secondNumber);
        Double expectedResult = 3.5D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    @DisplayName("Test root of 4 = 2")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testSquareRoot() {
        double number = 4D;
        Double result = math.squareRoot(number);
        Double expectedResult = 2D;
        Assertions.assertEquals(expectedResult, result, number + " + " + "didn't produce " + expectedResult);
    }
}
