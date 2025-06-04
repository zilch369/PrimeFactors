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
        assertEquals(Arrays.asList(), PrimeFactor.of(1));
    }

    @Test
    public void testPrimeFactorsOf2() {
        assertEquals(Arrays.asList(2), PrimeFactor.of(2));
    }

    @Test
    public void testPrimeFactorsOf3() {
        assertEquals(Arrays.asList(3), PrimeFactor.of(3));
    }

    @Test
    public void testPrimeFactorsOf4() {
        assertEquals(Arrays.asList(2,2), PrimeFactor.of(4));
    }

    @Test
    public void testPrimeFactorsOf6() {
        assertEquals(Arrays.asList(2,3), PrimeFactor.of(6));
    }

    @Test
    public void testPrimeFactorsOf9() {
        assertEquals(Arrays.asList(3,3), PrimeFactor.of(9));
    }

    @Test
    public void testPrimeFactorsOf12() {
        assertEquals(Arrays.asList(2,2,3), PrimeFactor.of(12));
    }
}