package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedExampleTest {

	@ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testIsEven(int number) {
        assertTrue(number % 2 == 0);
    }

    @ParameterizedTest
    @CsvSource({
        "1, 1, 2",
        "2, 3, 5",
        "10, -5, 5"
    })
    void testAdditionFromCsv(int a, int b, int expected) {
       
     // Timeout check
        assertTimeout(Duration.ofSeconds(1), () -> {
        	 Calculator calc = new Calculator();
             assertEquals(expected, calc.add(a, b));
        });
    }
}
