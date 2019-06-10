package stacks_and_queues;

public class Queue {
    Node front;

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (this.front == null) {
            this.front = newNode;
            newNode.next = null;
        } else {
            this.front.next = newNode;
        }
    }

    public int dequeue() {
        int frontValue = this.front.data;

        if (this.front.next == null) {
            this.front = null;
        } else {

            this.front = this.front.next;
        }
        return frontValue;
    }

    public int peek() {
        return this.front.data;
    }
}
