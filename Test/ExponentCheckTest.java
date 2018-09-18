import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentCheckTest {
    ExponentCheck check = null;
    @Before
    public void setUp() throws Exception {
        check = new ExponentCheck();
    }

    @After
    public void tearDown() throws Exception {
        check = null;
    }

    @Test
    public void isPowerof4() throws Exception{
        assertTrue(check.isPowerOfFour(64));
    }

    @Test
    public void isNotPowerOf4() throws Exception{
        assertFalse(check.isPowerOfFour(32));
    }

    @Test
    public void checkFor0() throws Exception{
        assertFalse(check.isPowerOfFour(0));
    }

    @Test
    public void checkFor1() throws Exception{
        assertTrue(check.isPowerOfFour(1));
    }
}