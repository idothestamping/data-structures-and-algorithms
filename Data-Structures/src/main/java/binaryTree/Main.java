package binaryTree;

public class Main {

    public static void main(String[] args) {
//        1. Odd/even distiction in tree
        BinaryTree tree = new BinaryTree();
        tree.add("15"); // FizzBuzz
        tree.add("5");  // Buzz
        tree.add("3"); // Fizz
        Node node = tree.fizz(tree.node);
        System.out.println(node.value); // FizzBuzz
        System.out.println(node.left.value); // Buzz
        System.out.println(node.left.left.value); // Fizz

//        2. Breadth-first Traversal:
        BinaryTree tree2 = new BinaryTree();
        tree2.add("10");
        tree2.add("5");
        tree2.add("2");
        tree2.add("6");
        tree2.add("15");
        tree2.add("12");
        tree2.add("25");
        Node node2 = tree2.breadthTraverse(tree2.node);
        System.out.println("Values in node added by Breadth-first traversal is:");
        System.out.println(node2.value);

//        3. Find Max value: result is '25'
        int a = tree2.findmaximumvalue(tree2.node);
        System.out.println("Max value from Breath-first traversal Tree is:");
        System.out.println(a);

//        4. Traverse Binary Tree:
        BinaryTree tree3 = new BinaryTree();
        tree3.add("10");
        tree3.add("5");
        tree3.add("2");
        tree3.add("6");
        tree3.add("15");

        System.out.println("Preorder traversal of binary tree is ");
        tree3.getPreorderList();

        System.out.println("\nInorder traversal of binary tree is ");
        tree3.getInorderList();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree3.getPostorderList();

    }
}
