package graph;

import java.util.HashSet;

public class Node<T> {
    public T data;
    public HashSet<Edges> neighbors;

    public Node(T data){
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    public boolean addNeighbor(Node<T> node){
        Edges edge = new Edges(node);
        this.neighbors.add(edge);
        return true;
    }

    public boolean addNeighbor(Node<T> node, int weight){
        Edges edge = new Edges(node, weight);
        this.neighbors.add(edge);
        return true;
    }

    public String toString(){
        return this.data.toString();
    }

}
