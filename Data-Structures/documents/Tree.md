# Binary Tree and BST Implementation
Java program for different tree traversals 

## Challenge Description
**Tree**
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
* Create a BinaryTree class
* Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
* At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

* Create a BinarySearchTree class
* Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
* Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

**binaryTree**
* Write a function called binaryTree which takes a tree as an argument.
* Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
* If the value is divisible by 3, replace the value with “Fizz”
* If the value is divisible by 5, replace the value with “Buzz”
* If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
* Return the tree with its new values.

**Breadth-first Traversal**
* Breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach; print every visited node’s value.


## Approach & Efficiency
* Time/Space:
0(1)

## API
**Tree**
* preOrder() Given a binary tree, print its nodes in preorder.
* inOrder() Given a binary tree, print its nodes in inorder.
* postOrder() Given a binary tree, print its nodes according to the "bottom-up" postorder traversal.

**binaryTree**
* breadthTraverse() Given a binary tree, print its nodes in order of height.

## Solution (Code)
<!-- Link to code -->
* [Tree](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/tree/Tree.java)
* [binaryTree](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/FizzBuzzTree/FizzBuzzTree.java)
    * [Breadth-first Traversal Method](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/FizzBuzzTree/FizzBuzzTree.java)