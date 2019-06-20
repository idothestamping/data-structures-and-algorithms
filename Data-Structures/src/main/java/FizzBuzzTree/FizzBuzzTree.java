package FizzBuzzTree;

import java.util.LinkedList;
import java.util.Queue;

public class FizzBuzzTree {
    Node node;


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

    public static void main(String[] args) {
        FizzBuzzTree tree = new FizzBuzzTree();

        // FizzBuzz Tree:
//        tree.add("15"); // FizzBuzz
//        tree.add("5");  // Buzz
//        tree.add("3"); // Fizz
//        Node node = tree.fizz(tree.node);
//        System.out.println(node.value); // FizzBuzz
//        System.out.println(node.left.value); // Buzz
//        System.out.println(node.left.left.value); // Fizz


        // Breadth-first Traversal:
        tree.add("10");
        tree.add("5");
        tree.add("2");
        tree.add("6");
        tree.add("15");
        tree.add("12");
        tree.add("25");
//        Node node = tree.breadthTraverse(tree.node);
//        System.out.println(node.value);

        // Find Max value: result is '25'
        int a = tree.findmaximumvalue(tree.node);
        System.out.println(a);
    }
}
