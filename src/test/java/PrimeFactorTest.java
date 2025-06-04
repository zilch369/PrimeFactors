import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @BeforeEach
    public void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    public void testPrimeFactorsOf1() {
        setUp();
        assertEquals(Arrays.asList(), PrimeFactor.of(1));
    }

    @Test
    public void testPrimeFactorsOf2() {
        setUp();
        assertEquals(Arrays.asList(2), PrimeFactor.of(2));
    }

    @Test
    public void testPrimeFactorsOf3() {
        setUp();
        assertEquals(Arrays.asList(3), PrimeFactor.of(3));
    }
}