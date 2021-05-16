package za.ac.cput.legiste;

import org.junit.Test;

import static org.junit.Assert.*;

public class List_Test {

    // The test tests weather or not data has been added in the List collection
    @Test
    public void add() {
        List_ list = new List_();
        assertTrue(list.Add());
    }

    // This test will check weather or not the specified data was removed from the List
    @Test
    public void removeByIndex() {
        List_ list = new List_();
        list.Add();
        assertFalse(list.Remove(2));
    }

    // The test determines whether the data Expected matches the Actual data
    @Test
    public void findByIndex() {
        List_ list = new List_();
        list.Add();
        assertEquals("Kraaifontein",list.Find(5));
    }
}