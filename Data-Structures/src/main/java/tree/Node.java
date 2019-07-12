package tree;

public class Node<T> {
    protected T value;
    protected Node left;
    protected Node right;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}