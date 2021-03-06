package linked_list;

import java.util.ArrayList;
import java.util.List;

public class LinkedListNum {
    public Node head;  // Head is first node in linked list

    public boolean includes(){
        return length() == 0;
    }

    public void insert(int data){
        Node current = new Node(data, head);
        head = current;
    }

    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    public Node tail() {
        Node tail = head;

        // Find last element of linked list known as tail
        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }

    public int length() {
        int length = 0;
        Node current = head;  // Starts counting from head - first node
        while(current != null){
            length ++;
            current = current.next;
        }
        return length;
    }

//    public static int getLengthRecursion(Node n) {
//        if (n == null) {
//            return 0;
//        } else {
//            return 1 + getLengthRecursion(n.next);
//        }
//    }
//
//    public static int getSumLengthRecursion(Node n) {
//        if (n == null) {
//            return 0;
//        } else {
//            return n.data + getSumLengthRecursion(n.next);
//        }
//    }
//
//    public static int getMaxIntRecursion(Node n) {
//        if (n == null) {
//            return 0;
//        } else {
//            return n.data + getSumLengthRecursion(n.next);
//        }
//    }

    public List<Integer> printList(){

        Node current = head;
        List<Integer> result = new ArrayList<>();

        //Loop while current node is not null
        while(current != null){
            result.add(current.data);
            current = current.next;
        }
        return result;
    }

    public void insertBefore(int val, int newVal) {

        Node newNode = new Node(newVal);
        Node itr = this.head;
        Node itrPrev = null;

        // Throw exception if empty linked list
        if (itr == null) {
            System.out.println("The insert before value " + val + " was not found because the linked list is empty");
            throw new IllegalArgumentException();
        }
        while (itr.data != val) {
            itrPrev = itr;
            itr = itr.next;
            // Throw exception if at end of link list
            if (itr == null) {
                System.out.println("The insert before value " + val + " was not found in the linked list");
                throw new IllegalArgumentException();
            }
        }
        if (itrPrev != null) {
            itrPrev.next = newNode;
        } else {
            this.head = newNode;
        }
        newNode.next = itr;
    }

    public void insertAfter(int val, int newVal) {

        // Throw exception if empty linked list
        if (this.head == null) {
            System.out.println("The insert after value " + val + " was not found because the linked list is empty");
            throw new IllegalArgumentException();
        }

        Node newNode = new Node(newVal);
        Node itr = this.head;

        while (itr.data != val) {
            itr = itr.next;
            // Throw exception if at end of link list
            if (itr == null) {
                System.out.println("The insert after value " + val + " was not found in the linked list");
                throw new IllegalArgumentException();
            }
        }
        Node nextNode = itr.next;
        itr.next = newNode;
        itr.next.next = nextNode;
    }

    public int kthFromEnd(int k) {

        int size = 0;
        Node current = null;
        while(current != null){
            size++;
            current = current.next;
        }

        if (k < size) {
            System.out.println("The argument " + k + " is a negative number which is not a valid argument");
            throw new IllegalArgumentException();
        }

        for (Node itr = this.head; itr != null; itr = itr.next) {

            if (size == k) current = this.head;
            if (size > k) current = current.next;
            size++;
        }

        // Throw exception if loop didn't get to or past head node
        if (current == null) {
            System.out.println("The argument " + k + " is too large. The link only has " + size + " nodes");
            throw new IllegalArgumentException();
        }
        return current.data;
    }

    public static LinkedListNum mergeLists(LinkedListNum one, LinkedListNum two) {

        Node list1 = one.head;
        Node list2 = two.head;
        Node list1Next = null;
        Node list2Next = null;

        while (list1 != null && list2 != null) {
            list1Next = list1.next;
            list2Next = list2.next;

            list1.next = list2;
            list2.next = list1Next;

            list1 = list1Next;
            list2 = list2Next;
        }

        for (Node itr = one.head; itr != null; itr = itr.next) {
            System.out.println(itr.data);
        }
        return one;
    }

    public static int getLengthRecursion(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + getLengthRecursion(n.next);
        }
    }

    public static int getSumLengthRecursion(Node n) {
        if (n == null) {
            return 0;
        } else {
            return n.data + getSumLengthRecursion(n.next);
        }
    }

    public static int getMaxIntRecursion(Node n) {
        if (n == null) {
            return 0;
        } else {
            return n.data + getSumLengthRecursion(n.next);
        }
    }

    public static class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node theNext){
            this.data = data;
            this.next = theNext;
        }
    }
}