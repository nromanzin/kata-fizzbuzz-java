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
}
