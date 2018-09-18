import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    MemberVariable test = null;

    @Before
    public void setUp() throws Exception {
        test = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void memberTest1() throws Exception{
        assertEquals("ABC 23 500000.0", test.initNPrint("ABC", 23, 500000));
    }

    @Test
    public void memberTest2() throws Exception{
        assertEquals("XYZ 30 600000.0", test.initNPrint("XYZ", 30, 600000));
    }
}