package stacks_and_queues;

public class Queue<T> {
    private Node<T> front;

    public void enqueue(T data) {
        Node<T> newNode = new Node<T>(data);

        if (this.front == null) {
            this.front = newNode;
            newNode.next = null;
        } else {
            this.front.next = newNode;
        }
    }

    public T dequeue() {
        T frontValue = this.front.data;

        if (this.front.next == null) {
            this.front = null;
        } else {

            this.front = this.front.next;
        }
        return frontValue;
    }

    public T peek() {
        return this.front.data;
    }
}
