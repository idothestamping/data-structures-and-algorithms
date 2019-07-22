package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T> {
    private HashSet<Node<T>> vertices;

    public HashSet<Node<T>> getVertices() {
        return vertices;
    }

    public void setVertices(HashSet<Node<T>> vertices) {
        this.vertices = vertices;
    }

    public Graph(){
        this.vertices = new HashSet<>();
    }

    public Node<T>addNode(T data){
        Node node = new Node(data);
        this.vertices.add(node);
        return node;
    }

    public boolean addEdge(Node<T> node, Node<T> target){
        if(this.vertices.contains(node) && this.vertices.contains(target)){
            this.vertices.add(node);
            this.vertices.add(target);
            return true;
        }
        return false;
    }

    public void getEdges(String[] input){

    }

    public HashSet<Node<T>>getNodes(){
        return this.vertices;
    }

    public HashSet<Edges> getNeighbors(Node<T> node){
        return node.neighbors;
    }

    public int getSize(){
        return this.vertices.size();
    }

    public static LinkedList<Node> breadthFirstSearch(Node start){
        LinkedList resultList = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        if(start == null){
            throw new NullPointerException("Cannot be null");
        }

        Queue queue  = new LinkedList();
        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            Node tempNode = (Node) queue.remove();
            resultList.add(tempNode);

            for(Edges neighbor: (HashSet<Edges>) tempNode.neighbors){
                if(!visited.contains(neighbor.node)){
                    queue.add(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        return resultList;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");
        //        System.out.println(cat);
        cat.addNeighbor(dog, 20);
        cat.addNeighbor(hamster, 50);

        dog.addNeighbor(cat);
        hamster.addNeighbor(cat);

        //check for edges
        System.out.println("Check for edges");
        System.out.println(graph.addEdge(cat, dog));
        System.out.println(graph.addEdge(cat, hamster));

        System.out.println("Get Nodes: "  +graph.getNodes().toString());

        System.out.println("Get " + cat + " neighbors: " + graph.getNeighbors(cat));
        System.out.println("Get " + dog + " neighbors: " + graph.getNeighbors(dog));
        System.out.println("Get " + hamster + " neighbors: " + graph.getNeighbors(hamster));

        System.out.println(graph.getSize());

        System.out.println("BFS: " + breadthFirstSearch(cat));
        System.out.println("BFS: " + breadthFirstSearch(dog));
        System.out.println("BFS: " + breadthFirstSearch(hamster));
    }
}