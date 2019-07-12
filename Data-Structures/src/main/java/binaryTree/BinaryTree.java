package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    protected Node node;
    protected Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(String value) {
        node = addRecursive(node, value);
    }

    private Node addRecursive(Node current, String value) {

        if (current == null) return new Node(value);

        if (Integer.parseInt(value) < Integer.parseInt(current.value)) {
            current.left = addRecursive(current.left, value);
        } else if (Integer.parseInt(value) > Integer.parseInt(current.value)) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public Node fizz(Node node) {

        if (node != null) {
            if (Integer.parseInt(node.value) % 15 == 0) {
                node.value = "FizzBuzz";
            } else if (Integer.parseInt(node.value) % 5 == 0) {
                node.value = "Buzz";
            } else if (Integer.parseInt(node.value) % 3 == 0) {
                node.value = "Fizz";
            }
            fizz(node.left);
            fizz(node.right);
        }
        return node;
    }

    public Node breadthTraverse(Node root) {

        Queue<Node> ll = new LinkedList<>();

        ll.add(node);

        while (!ll.isEmpty()) {
            Node node = ll.remove();
            System.out.println(node.value);

            if (node.left != null) {
                ll.add(node.left);
            }
            if (node.right != null) {
                ll.add(node.right);
            }
        }
        return node;
    }

    public int findmaximumvalue(Node node){
        int cur = -9999;
        if (node ==null)return cur;
        cur = Integer.parseInt(node.value);
        cur = findmaximumvalue(node.left)>cur?findmaximumvalue(node.left):cur;
        cur = findmaximumvalue(node.right)>cur?findmaximumvalue(node.right):cur;
        return cur;
    }

    public void getPreOrderList(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.value + " ");

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
        System.out.print(node.value + " ");

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
        System.out.print(node.value + " ");
    }

    // Wrappers over recursive function using List
    public List<Integer> getPreorderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getPreorderListRec(list);
        return list;
    }

    public void getPreorderListRec(List<Integer> list) {
        getPreOrderList(node);
    }


    public List<Integer> getPostorderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getPostorderListRec(list);
        return list;
    }

    public void getPostorderListRec(List<Integer> list) {
        getPostorderList(node);
    }


    public List<Integer> getInorderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getInorderListRec(list);
        return list;
    }

    public void getInorderListRec(List<Integer> list) {
        getInorderList(node);
    }

}
