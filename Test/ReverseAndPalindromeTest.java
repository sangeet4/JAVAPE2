import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAndPalindromeTest {
    ReverseAndPalindrome test = null;
    @Before
    public void setUp() throws Exception {
        test = new ReverseAndPalindrome();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void isPalindrome() throws Exception{
        assertTrue(test.checkPalindrome("Madam"));
    }

    @Test
    public void isnotPalindrome() throws Exception{
        assertFalse(test.checkPalindrome("Hello"));
    }

    @Test
    public void emptyInputCheck() throws Exception{
        assertTrue(test.checkPalindrome(""));
    }
}