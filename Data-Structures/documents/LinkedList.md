# Singly Linked List
Singly linked list allows you to traverse in one direction, mostly forward.

## Challenge Description
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Within LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.

## Approach & Efficiency
* Time/Space:
- insert 0(1)
- includes 0(n)
- print 0(n)
- append 0(1)
- insertBefore 0(n)
- insertAfter 0(n)

## API
insert - The value is inserted at the start of the list.
includes - Searching involves looping through the list.
print - Looping through all nodes.
append - We are just getting the tail to append the new node.
insertBefore - Looping through the list to find and insert the new value before the current value.
insertAfter - Looping through the list to find and insert the new value after the current value.
kth from the end - Takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list.

## Solution (Code)
<!-- Link to code -->
[Solution Code](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/linked_list/LinkedList.java)
## Solution (Whiteboard)
<!-- Embedded whiteboard image -->
![Append, InsertBefore, InserftAfter](./assets/LinkedList.jpg?raw=true "Linked List")
![kth from the end](./assets/ll_kth_from_end.jpg?raw=true "ll_kth_from_end")