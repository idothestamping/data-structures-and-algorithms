# Graphs

## Challenge
Implement graph data structures with the following methods:

AddNode()
AddEdge()
GetNodes()
GetNeighbors()
Size()

## Approach & Efficiency
Create a tree intersection method that accepts both binary trees and compares each node in both trees.
First, convert each tree to a hashset then using binary trees preorder to add them to the list.
Then check for hashset2 contains the same value as hashset1 and add to a new hashset.

Time | Space
--- | ---
O(v) | O(n)

# API
AddNode()
Adds a new node to the graph
Takes in the value of that node
Returns the added node
2.AddEdge()

Adds a new edge between two nodes in the graph
Include the ability to have a “weight”
Takes in the two nodes to be connected by the edge
Both nodes should already be in the Graph
3.GetNodes()

Returns all of the nodes in the graph as a collection (set, list, or similar)
4.GetNeighbors()

Returns a collection of nodes connected to the given node
Takes in a given node
Include the weight of the connection in the returned collection
5.Size()

Returns the total number of nodes in the graph

## Solution
[Code](../src/main/java/graph/Graph.java) | [Tests](../src/test/java/graph/GraphTest.java)
