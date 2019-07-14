package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    protected Node root;

    public Node getNode() {
        return root;
    }

    public void setNode(Node root) {
        this.root = root;
    }

    public void add(String value) {
        root = addRecursive(root, value);
    }
    public void add(int data) {
        root = addRecursive(root, data);
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

    private Node addRecursive(Node current, int data) {

        if (current == null) return new Node(data);

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    public Node fizzBuzzTree(Node node) {

        if (node != null) {
            if (Integer.parseInt(node.value) % 15 == 0) {
                node.value = "FizzBuzz";
            } else if (Integer.parseInt(node.value) % 5 == 0) {
                node.value = "Buzz";
            } else if (Integer.parseInt(node.value) % 3 == 0) {
                node.value = "Fizz";
            }
            fizzBuzzTree(node.left);
            fizzBuzzTree(node.right);
        }
        return node;
    }

    public Node breadthTraverse(Node root) {

        Queue<Node> ll = new LinkedList<>();

        ll.add(root);

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
        return root;
    }

    public int findmaximumvalue(Node root){
        int cur = -9999;
        if (root == null)
            return cur;
        cur = Integer.parseInt(root.value);
        cur = findmaximumvalue(root.left) > cur ? findmaximumvalue(root.left) : cur;
        cur = findmaximumvalue(root.right) > cur ? findmaximumvalue(root.right) : cur;
        return cur;
    }

    public void getPreOrderList(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.data + " ");

        /* then recur on left subtree */
        getPreOrderList(node.left);

        /* now recur on right subtree */
        getPreOrderList(node.right);
    }

    public void getInOrderList(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        getInOrderList(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        getInOrderList(node.right);
    }

    public void getPostOrderList(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        getPostOrderList(node.left);

        // then recur on right subtree
        getPostOrderList(node.right);

        // now deal with the node
        System.out.print(node.data + " ");
    }

    // Wrappers over recursive function using List
    public List<Integer> getPreorderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getPreOrderListRec(list);
        return list;
    }

    public void getPreOrderListRec(List<Integer> list) {
        getPreOrderList(root);
    }


    public List<Integer> getInOrderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getInOrderListRec(list);
        return list;
    }

    public void getInOrderListRec(List<Integer> list) {
        getInOrderList(root);
    }


    public List<Integer> getPostOrderList() {
        ArrayList<Integer> list = new ArrayList<>();
        getPostOrderListRec(list);
        return list;
    }

    public void getPostOrderListRec(List<Integer> list) {
        getPostOrderList(root);
    }
}
