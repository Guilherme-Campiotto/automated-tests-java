package br.com.campiotto.automatedtestsjava.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.campiotto.math.SimpleMath;

public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double result = math.sum(firstNumber, secondNumber);
        Double expectedResult = 8.2D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6D;
        double secondNumber = 2D;
        Double result = math.subtraction(firstNumber, secondNumber);
        Double expectedResult = 4D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 5D;
        double secondNumber = 2D;
        Double result = math.multiplication(firstNumber, secondNumber);
        Double expectedResult = 10D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }

    @Test
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 21;
        double secondNumber = 3D;
        Double result = math.division(firstNumber, secondNumber);
        Double expectedResult = 7D;
        Assertions.assertEquals(expectedResult, result, firstNumber + " + " + secondNumber + "didn't produce " + expectedResult);
    }
}
