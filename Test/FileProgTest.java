import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileProgTest {
    FileProg test = null;
    String fileName = "/home/cgi/IdeaProjects/Practice2/src/loremIpsum.txt";

    @Before
    public void setUp() throws Exception {
        test = new FileProg();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void lengthCheck() throws Exception{
        assertEquals(11, test.checkLegth(fileName));
    }

    @Test
    public void ucaseCheck() throws Exception{
        assertEquals("LOREM IPSUM", test.convertToUcaseNPrint(fileName));
    }
}