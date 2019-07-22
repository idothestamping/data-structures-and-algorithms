package graph;

public class Edges<T> {
    public int weight;
    public Node<T> node;

    public Edges(Node<T> node){
        this.node = node;
    }

    public Edges(Node<T> node, int weight){
        this.node = node;
        this.weight = weight;
    }

    public Node<T> getNode(){
        return this.node;
    }

    @Override
    public String toString(){
        return this.node.toString();
    }
}