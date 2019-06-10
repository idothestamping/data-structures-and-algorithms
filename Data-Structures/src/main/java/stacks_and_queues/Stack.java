package stacks_and_queues;

public class Stack {
    Node top;

    public void push(int data) {
        Node newNode = new Node(data);

        if (this.top == null) {
            this.top = newNode;
            newNode.next = null;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    public int pop() {
        int topData = this.top.data;

        if (this.top.next == null) {
            this.top = null;

        } else {
            this.top = this.top.next;
        }
        return topData;
    }

    public int peek() {
        return this.top.data;
    }
}