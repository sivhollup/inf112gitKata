package inf112.git;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void lowerBoundRegularNumber() {
        assertEquals("1", fizzBuzz.compute(1));
    }

    @Test
    public void convert2ToStringRepresentation() {
        assertEquals("2", fizzBuzz.compute(2));
    }

    @Test
    public void convert3ToFizz() {
        assertEquals("Fizz", fizzBuzz.compute(3));
    }
}