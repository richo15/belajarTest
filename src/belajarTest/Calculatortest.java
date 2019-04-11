package belajarTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Calculatortest {
	
	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator Calculatora = new Calculator();
		assertEquals(2, Calculatora.add(1, 3), "1 + 3 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + "+" + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("1 * 1 = 1")
	void multTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.multiply(1, 1), "1 * 1 should equal 1");
	}

	@ParameterizedTest(name = "{0} * {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"1,    2,   2",
			"4,	   5,  20",
			"6,    5,  30"
	})
	void multiply(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.multiply(first, second),
				() -> first + "*" + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("1 / 2 = 0.5")
	void divTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(0.5, calculator.divide(1, 2), "1 / 2 should equal 0.5");
	}

	@ParameterizedTest(name = "{0} / {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"1,    2, 0.5",
			"4,	   5, 0.8",
			"6,    5, 1.2"
	})
	void divide(double first, double second, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.divide(first, second),
				() -> first + "/" + second + " should equal " + expectedResult);
	}
}
