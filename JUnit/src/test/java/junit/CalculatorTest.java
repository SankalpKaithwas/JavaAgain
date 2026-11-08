package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Should add two integers correctly")
	void testAdd() {
		int result = calculator.add(2, 3);
		assertEquals(5, result, "2 + 3 should equal 5");
	}

	@Test
	@DisplayName("Should devide two integers correctly")
	void testDivide() {
		int result = calculator.divide(4, 2);
		assertEquals(2,result,"4 / 2 should equal 2");
	}
	
	@Test
	@DisplayName("Should throw ArithmeticException when dividing by zero")
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
	}
}
