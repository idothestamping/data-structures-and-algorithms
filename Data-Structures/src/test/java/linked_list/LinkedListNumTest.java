package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class LinkedListNumTest {

    @Test
    public void testNewLinkedListNum() {
        LinkedListNum list = new LinkedListNum();
        assertTrue("linked list should be empty", list.includes());
        assertEquals("length of linked list should be zero", 0, list.length());

        list.append(1);
        assertFalse("linked list should not be empty", list.includes());
        assertEquals("length of linked list should be 1", 1, list.length());

        list.append(2);
        assertFalse("linked list should not be empty", list.includes());
        assertEquals("length of linked list should be 2", 2, list.length());

        list.insert(3);
        assertEquals("length of linked list should be 3", 3, list.length());
    }

    @Test
    public void testHead() {
        LinkedListNum test = new LinkedListNum();
        test.insert(1);
        assertEquals("Head should be the last inserted value", 1, test.head.data);

        test.insert(2);
        assertEquals("Head should be the last inserted value", 2, test.head.data);
    }

    @Test
    public void testListPrint() {
        LinkedListNum list = new LinkedListNum();
        assertEquals("Should return empty", new ArrayList<>(), list.printList());

        list.append(1);
        System.out.println(list.printList());

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals("Should return a string", expected, list.printList());
    }

    @Test
    public void insertBeforeTest() {
        LinkedListNum list = new LinkedListNum();
        list.insert(1);
        list.insert(2);
        list.insertBefore(1, 2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(1);
//        System.out.println(list.printList());
        assertEquals("Insert before", expected, list.printList());
    }

    @Test
    public void insertAfterTest() {
        LinkedListNum list = new LinkedListNum();
        list.insert(1);
        list.insert(2);
        list.insertAfter(1, 3);
        System.out.println(list.printList());

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);
        System.out.println(list.printList());
        assertEquals("Insert before", expected, list.printList());
    }

    @Test
    public void testkthFromEndSameLength() {
        LinkedListNum list = new LinkedListNum();
        list.insert(1);
        list.insert(2);
        assertEquals("Should return head node value", list.kthFromEnd(1), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testkthFromEndArgNegative() {
        LinkedListNum list = new LinkedListNum();
        list.kthFromEnd(-1);
    }

    @Test
    public void testkthFromEndLengthOne() {
        LinkedListNum list = new LinkedListNum();
        list.insert(1);
        assertEquals("Should return head node value", list.kthFromEnd(0), 1);
    }

    @Test
    public void testkthFromEnd() {
        LinkedListNum list = new LinkedListNum();
        list.insert(2);
        list.insert(1);
        list.insert(3);
        list.insert(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);
        expected.add(4);
        System.out.println(list.printList());
        assertEquals("Should return value from node 2 from end", list.kthFromEnd(2), 3);
    }

    @Test
    public void testMergeLists() {
        LinkedListNum list1 = new LinkedListNum();
        LinkedListNum list2 = new LinkedListNum();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list2.insert(9);
        list2.insert(8);
        list2.insert(7);
        list2.insert(6);

        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(6);
        expected.add(3);
        expected.add(7);
        expected.add(2);
        expected.add(8);
        expected.add(1);
        expected.add(9);
        System.out.println(expected);

        assertEquals("Should return merged value from two lists", expected, LinkedListNum.mergeLists(list1, list2));
    }
}
