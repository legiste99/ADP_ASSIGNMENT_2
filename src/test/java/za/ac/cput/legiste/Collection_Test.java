package za.ac.cput.legiste;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Collection_Test {

    // Before each test execution, the collection.add() function is called to add data to the collection ArrayList
    // remove() or find() can not be work properly unless data is added first
    @Before
    public void setUp() throws Exception {
        Collection_ collection = new Collection_();
        collection.Add(5);
    }

    // The test tests weather or not data has been added in the collection ArrayList
    @Test
    public void add() {
        Collection_ collection = new Collection_();
        assertFalse(collection.isEmpty());
    }

    // This test will check weather or not the specified data was actually removed
    @Test
    public void remove() {
        Collection_ collection = new Collection_();
        assertTrue(collection.Remove(10));
    }

    // The test determines whether the data was found or not
    @Test
    public void find() {
        Collection_ collection = new Collection_();
        assertTrue(collection.Find(10));
    }
}