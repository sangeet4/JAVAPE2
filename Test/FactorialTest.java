import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial test = null;

    @Before
    public void setUp() throws Exception {
        test = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void checkFactorial() throws Exception{
        assertEquals(120, test.calcFactorial(5));
    }

    @Test
    public void checkFactorialFor0() throws Exception{
        assertEquals(1, test.calcFactorial(0));
    }

    @Test
    public void checkFactorialFor1() throws Exception{
        assertEquals(1, test.calcFactorial(1));
    }

    @Test
    public void checkFactorialFor20plus() throws Exception{
        assertEquals(-1, test.calcFactorial(23));
    }
}