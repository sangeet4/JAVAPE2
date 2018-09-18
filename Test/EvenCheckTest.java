import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkEven() throws Exception{
        assertTrue(EvenCheck.isEven(24));
    }

    @Test
    public void checkOdd() throws Exception{
        assertFalse(EvenCheck.isEven(27));
    }
}