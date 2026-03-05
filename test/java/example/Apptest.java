import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EvenOddTest {

    private final EvenOdd evenOdd = new EvenOdd();

    @Test
    void testIsEvenWithEvenNumber() {
        assertTrue(evenOdd.isEven(2), "2 should be even");
        assertTrue(evenOdd.isEven(100), "100 should be even");
    }


