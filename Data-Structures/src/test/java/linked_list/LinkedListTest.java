package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class LinkedListTest {
    @Test
    public void testNewLinkedList(){
        LinkedList list = new LinkedList();
        assertTrue("linked list should be empty", list.includes());
        assertEquals("length of linked list should be zero",0, list.length());

        list.insert("doug");
        assertFalse("linked list should not be empty", list.includes());
        assertEquals("length of linked list should be 1", 1, list.length());

        list.insert("doug, john, livi");
        assertFalse("linked list should not be empty", list.includes());
        assertEquals("length of linked list should be 1", 2, list.length());
    }
}
