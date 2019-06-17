package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    Tree() {
        root = null;
    }

    public static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public void getPreOrderList(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        getPreOrderList(node.left);

        /* now recur on right subtree */
        getPreOrderList(node.right);
    }

    public void getInorderList(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        getInorderList(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        getInorderList(node.right);
    }

    public void getPostorderList(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        getPostorderList(node.left);

        // then recur on right subtree
        getPostorderList(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    // Wrappers over above recursive functions
//    public void printPostorder() {
//        printPostorder(root);
//    }
//    public void printInorder() {
//        printInorder(root);
//    }
//    public void printPreorder() {
//        printPreorder(root);
//    }

    // Wrappers over recursive function using List
    public List<Integer> getPreorderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getPreorderListRec(list);
        return list;
    }

    public void getPreorderListRec(List<Integer> list) {
        getPreOrderList(root);
    }

    public List<Integer> getPostorderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getPostorderListRec(list);
        return list;
    }

    public void getPostorderListRec(List<Integer> list) {
        getPostorderList(root);
    }

    public List<Integer> getInorderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getInorderListRec(list);
        return list;
    }

    public void getInorderListRec(List<Integer> list) {
        getInorderList(root);
    }

    // Driver method
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.getPreorderList();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.getInorderList();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.getPostorderList();
    }
}
