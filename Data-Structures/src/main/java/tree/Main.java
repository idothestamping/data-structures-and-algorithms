package tree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        1. FizzBuzzTree:
        BinaryTree tree = new BinaryTree();
        tree.add("15"); // FizzBuzz
        tree.add("5");  // Buzz
        tree.add("3"); // Fizz
        Node fizzbuzztree = tree.fizzbuzzMethod(tree.root);
        System.out.println(fizzbuzztree.value); // FizzBuzz
        System.out.println(fizzbuzztree.left.value); // Buzz
        System.out.println(fizzbuzztree.left.left.value); // Fizz

//        2. Breadth-first Traversal:
        BinaryTree tree2 = new BinaryTree();
        tree2.add("10");
        tree2.add("5");
        tree2.add("2");
        tree2.add("6");
        tree2.add("15");
        tree2.add("12");
        tree2.add("25");
        System.out.println("\nBreadth traversal of tree is: ");
        tree2.breadthTraverse(tree2.root);
//        System.out.println(breadth.value);

//        3. Find Max value: result is '25'
        System.out.println("\nMax value in the breadth traversal's binary tree is: ");
        int a = tree2.findmaximumvalue(tree2.root);
        System.out.println(a);

//        4. Tree traversal:
        // Traverse Binary Tree:
        //       1
        //      /  \
        //     2    3
        //    /  \
        //   4    5
        BinaryTree tree3 = new BinaryTree();
        tree3.root = new Node(1);
        tree3.root.left = new Node(2);
        tree3.root.right = new Node(3);
        tree3.root.left.left = new Node(4);
        tree3.root.left.right = new Node(5);

        System.out.println("\nPreorder traversal of binary tree is ");
        tree3.getPreorderList();

        System.out.println("\nInorder traversal of binary tree is ");
        tree3.getInOrderList();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree3.getPostOrderList();
    }
}
