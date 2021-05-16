package za.ac.cput.legiste;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Set_Test {

    /**
    @Before
    public void setUp() throws Exception {
        Set_ set = new Set_();
        set.Add(5);
    }
    */

    // The test tests weather or not data has been added in the collection Set
    @Test
    public void add() {
        Set_ set = new Set_();
        assertFalse(set.Add(5));
    }

    // This test will check weather or not the specified data was actually removed
    @Test
    public void remove() {
        Set_ set = new Set_();
        set.Add(5);
        assertTrue(set.Remove(20));
    }

    // The test determines whether the data was found or not
    @Test
    public void find() {
        Set_ set = new Set_();
        set.Add(5);
        assertTrue(set.Find(10));
    }
}