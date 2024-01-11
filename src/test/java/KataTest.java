import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    private Fizzbuzz fizzbuzz;

    @BeforeEach
    public void beforeEach() {
        this.fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void shouldReturn1WhenGiven1() {
        assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    public void shouldReturn2WhenGiven2() {
        assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    public void shouldReturnFizzWhenGiven3() {
        assertEquals("Fizz", fizzbuzz.convert(3));
    }
}
