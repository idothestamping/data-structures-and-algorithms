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

    public List<Integer> preorder(){
        List<Integer> list = new ArrayList<>();
        return preorderHelper(list, this.root);
    }
    public List<Integer> preorderHelper(List list, Node node) {
        if (node != null) {
            System.out.print(" " + node.getData());
            list.add(node.getData());
            preorderHelper(list, node.getLeft());
            preorderHelper(list, node.getRight());
        }
        return list;
    }

    public List<Integer> inorder(){
        List<Integer> list = new ArrayList<>();
        return inorderHelper(list, this.root);
    }

    public List<Integer> inorderHelper(List<Integer> list, Node node){
        if (node != null) {
            inorderHelper(list, node.getLeft());
            System.out.print(" " + node.getData());
            list.add(node.getData());
            inorderHelper(list, node.getRight());
        }
        return list;
    }

    public List postorder(){
        List<Integer> list = new ArrayList<>();
        return postorderHelper(list, this.root);
    }


    public List<Integer> postorderHelper(List list, Node node) {
        if (node != null) {
            postorderHelper(list, node.getLeft());
            postorderHelper(list, node.getRight());
            list.add(node.getData());
            System.out.print(" " + node.getData());
        }
        return list;
    }
}
