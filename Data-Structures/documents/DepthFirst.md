# Depth First Search with Graph

 Conduct a depth first pre-order traversal on a graph.

 ## Challenge

Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. 
Without utilizing any of the built-in methods available to your language, return a collection of nodes 
in their pre-order depth-first traversal order.

 ## Approach and Efficiency
Create a method that takes in a graph starting at a specific start node. Create a stack to see if the node has been 
visited.  The top node of the stack will be the node to be evaluated. Next, the while loop will be used to traverse 
through the graph and check the neighbor nodes if they have been visited. Pop the the node from the stack if the node
 has not been visited. The method returns a list of all the nodes in that order.

  Time | Space
 --- | ---
 O(v) | O(v)


 ## Solution

 [Code](../src/main/java/graph/Graph.java) | [Tests](../src/test/java/graph/GraphTest.java)


