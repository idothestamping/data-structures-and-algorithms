# Stack and Queues
Stacks and queues are special cases of the idea of a collection. Each is characterized by four operations: create the collection, insert an item, remove an item, and test whether the collection is empty.

## Challenge Description
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.
* Create a Queue class that has a front property. It creates an empty Queue when instantiated.

## Approach & Efficiency
* Time/Space:
0(n)

## API
* push() which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
* pop() that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
* peek() that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.

## Solution (Code)
* [Node](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/stacks_and_queues/Node.java)
* [Stack](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/stacks_and_queues/Stack.java)
* [Queue](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/stacks_and_queues/Queue.java)

