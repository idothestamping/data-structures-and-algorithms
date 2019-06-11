package stacks_and_queues;

public class Stack<T> {
    protected Node<T> top;

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);

        if (this.top == null) {
            this.top = newNode;
            newNode.next = null;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    public T pop() {
        T topData = this.top.data;

        if (this.top.next == null) {
            this.top = null;

        } else {
            this.top = this.top.next;
        }
        return topData;
    }

    public T peek() {
        return this.top.data;
    }

    public T getTop(){
        if (top != null) {
            return top.data;
        }
        return null;
    }
}