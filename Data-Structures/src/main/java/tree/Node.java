package tree;

public class Node<E> {
    E value;
    Node<E> left, right;

    public Node(E value) {
        this.value = value;
        left = right = null;
    }

    public E getValue() {
        return value;
    }
}