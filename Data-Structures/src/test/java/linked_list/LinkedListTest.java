package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LinkedListTest {

    @Test
    public void testNewLinkedList() {
        LinkedList list = new LinkedList();
        assertTrue("linked list should be empty", list.includes());
        assertEquals("length of linked list should be zero", 0, list.length());

        list.append("doug");
        assertFalse("linked list should not be empty", list.includes());
        assertEquals("length of linked list should be 1", 1, list.length());

        list.append("doug, john, livi");
        assertFalse("linked list should not be empty", list.includes());
        assertEquals("length of linked list should be 2", 2, list.length());

        list.insert("doug");
        assertEquals("length of linked list should be 3", 3, list.length());
    }

    @Test
    public void testHead() {
        LinkedList test = new LinkedList();
        test.insert("Doug");
        assertEquals("Head should be the last inserted value", "Doug", test.head.data);

        test.insert("John");
        assertEquals("Head should be the last inserted value", "John", test.head.data);
    }

    @Test
    public void testListPrint() {
        LinkedList list = new LinkedList();
        assertEquals("Should return empty", new ArrayList<>(), list.printList());

        list.append("doug");
        System.out.println(list.printList().toString());

        List<String> expected = new ArrayList<>();
        expected.add("doug");
        assertEquals("Should return a string", expected, list.printList());
    }

    @Test
    public void insertBeforeTest() {
        LinkedList list = new LinkedList();
        list.insert("doug");
        list.insert("dave");
        list.insertBefore("doug", "john");

        List<String> expected = new ArrayList<>();
        expected.add("dave");
        expected.add("john");
        expected.add("doug");
//        System.out.println(list.printList().toString());
        assertEquals("Insert before", expected, list.printList());
    }

    @Test
    public void insertAfterTest() {
        LinkedList list = new LinkedList();
        list.insert("doug");
        list.insert("dave");
        list.insertAfter("doug", "john");
        System.out.println(list.printList().toString());

        List<String> expected = new ArrayList<>();
        expected.add("dave");
        expected.add("doug");
        expected.add("john");
        System.out.println(list.printList().toString());
        assertEquals("Insert before", expected, list.printList());
    }

    @Test
    public void testkthFromEndSameLength() {
        LinkedList list = new LinkedList();
        list.insert("doug");
        list.insert("dave");
        assertEquals("Should return head node value", list.kthFromEnd(1), "dave");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testkthFromEndArgNegative() {
        LinkedList list = new LinkedList();
        list.kthFromEnd(-1);
    }

    @Test
    public void testkthFromEndLengthOne() {
        LinkedList list = new LinkedList();
        list.insert("doug");
        assertEquals("Should return head node value", list.kthFromEnd(0), "doug");
    }

    @Test
    public void testkthFromEnd() {
        LinkedList list = new LinkedList();
        list.insert("dave");
        list.insert("doug");
        list.insert("john");
        list.insert("jim");
        List<String> expected = new ArrayList<>();
        expected.add("dave");
        expected.add("doug");
        expected.add("john");
        expected.add("jim");
        System.out.println(list.printList().toString());
        assertEquals("Should return value from node 2 from end", list.kthFromEnd(2), "john");
    }

    @Test
    public void testMergeLists() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insert("dave");
        list1.insert("doug");
        list1.insert("john");
        list1.insert("jim");
        list2.insert("dave2");
        list2.insert("doug2");
        list2.insert("john2");
        list2.insert("jim2");
        List<String> expected = new ArrayList<>();
        expected.add("dave");
        expected.add("doug2");
        expected.add("john");
        expected.add("jim2");
        expected.add("dave2");
        expected.add("doug");
        expected.add("john2");
        expected.add("jim");
        System.out.println(expected.toString());

        assertEquals("Should return merged value from two lists", expected, LinkedList.mergeLists(list1, list2));
    }
}
