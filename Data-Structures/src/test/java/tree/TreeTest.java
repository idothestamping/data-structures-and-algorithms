package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void printPreorder() throws Exception {

    }

    @Test
    public void printInorder() {
    }

    @Test
    public void printPostorder() {
    }

    @Test
    public void printPostorder1() {
    }

    @Test
    public void printInorder1() {
    }

    @Test
    public void printPreorder1() {
    }

    @Test
    public void main() {
        Tree tree = new Tree();
        tree.root = new Tree.Node(1);
        tree.root.left = new Tree.Node(2);
        tree.root.right = new Tree.Node(3);
        tree.root.left.left = new Tree.Node(4);
        tree.root.left.right = new Tree.Node(5);
        assertEquals("Preorder traversal of binary tree is", "1 2 4 5 3", tree.getPreorderList());
    }
}