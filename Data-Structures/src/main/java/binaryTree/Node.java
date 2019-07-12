package binaryTree;

public class Node {
    String value;
    Node left;
    Node right;
    int num;

    Node(String value) {
        this.value = value;
        left = null;
        right = null;
    }

    Node(int value) {
        this.num = value;
        left = null;
        right = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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
}