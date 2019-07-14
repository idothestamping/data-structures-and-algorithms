package tree;

public class Node {
    String value;
    Node left;
    Node right;
    int data;

    Node(String value) {
        this.value = value;
        left = null;
        right = null;
    }

    Node(int value) {
        this.data = value;
        left = null;
        right = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getData() {
        return data;
    }

    public void setValue(int value) {
        this.data = value;
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
}