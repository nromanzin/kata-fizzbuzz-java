import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    private Fizzbuzz fizzbuzz;

    @BeforeEach
    public void beforeEach() {
        this.fizzbuzz = new Fizzbuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8})
    public void shouldReturnInputValueAsStr(int input) {
        assertEquals(String.valueOf(input), fizzbuzz.convert(input));
    }


    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void shouldReturnFizzWhenGivenMultipleOf3(int input) {
        assertEquals("Fizz", fizzbuzz.convert(input));
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    public void shouldReturnBuzzWhenGivenMultipleOf5(int input) {
        assertEquals("Buzz", fizzbuzz.convert(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    public void shouldReturnFizzBuzzWhenGivenMultipleOf3And5(int input) {
        assertEquals("FizzBuzz", fizzbuzz.convert(input));
    }
}
