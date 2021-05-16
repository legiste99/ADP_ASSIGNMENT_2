package za.ac.cput.legiste;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Map_Test {

    // Before each test execution, the collection.add() function is called to add data to the collection ArrayList
    // remove() or find() can not be work properly unless data is added first
 /*   @Before
    public void setUp() throws Exception {
        Map_ map = new Map_();
        map.Add();
    }*/

    // The test tests weather or not data has been added in the HashMap
    @Test
    public void add() {
        Map_ map = new Map_();
        assertFalse(map.Add());
    }

    // This test will check weather or not the specified data was removed
    @Test
    public void remove() {
        Map_ map = new Map_();
        map.Add();
        map.Remove(0);
        assertEquals("Arron", map.Find(0)); // Inorder to determine whether an item has been removed or not,
                                                        // we first have to add() it , remove() it and then try to find() it
                                                        // to see whether it is still there or not.
    }

    // The test determines whether the data was found or not
    @Test
    public void find() {
        Map_ map = new Map_();
        map.Add();                                       // Data to find is added first
        assertEquals("Arron", map.Find(0)); // This checks whether the the expected data/Object matches the actual data/Object
    }
}