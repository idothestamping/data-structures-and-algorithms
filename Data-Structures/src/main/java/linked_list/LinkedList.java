package linked_list;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public Node head;  // Head is first node in linked list

    public boolean includes(){
        return length() == 0;
    }

    public void insert(String data){
        Node current = new Node(data, head);
        head = current;
    }

    public void append(String data){
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

    public List<String> printList(){

        Node current = head;
        List<String> result = new ArrayList<>();

        //Loop while current node is not null
        while(current != null){
            result.add(current.data);
            current = current.next;
        }
        return result;
    }

    public void insertBefore(String val, String newVal) {

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

    public void insertAfter(String val, String newVal) {

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
        Node NextNode = itr.next;
        itr.next = newNode;
        itr.next.next = NextNode;
    }

    public String kthFromEnd(int k) {

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

    public static class Node {
        public Node next;
        public String data;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

        public Node(String data, Node theNext){
            this.data = data;
            this.next = theNext;
        }

            @Override
        public String toString() {
            return this.data;
        }
    }
}