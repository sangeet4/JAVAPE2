import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade test = null;
    int grades[] = {30,45,60,90,75,65,83};
    @Before
    public void setUp() throws Exception {
        test = new StudentGrade();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void checkMin() throws Exception{
        assertEquals(30, test.minG(7, grades));
    }

    @Test
    public void checkMax() throws Exception{
        assertEquals(90, test.maxG(7, grades));
    }

    @Test
    public void checkAvg() throws Exception{
        assertEquals(64, test.avgG(7,grades), 0.0f);
    }
}