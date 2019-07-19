package graph;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class GraphTest {
    @Test
    public void testGraph(){
        Graph graph = new Graph();
        Node test = graph.addNode("test");
        Node test2 = graph.addNode("test2");

        assertEquals(2, graph.getSize());
        assertTrue(graph.getNodes().contains(test));
        assertTrue(graph.getNodes().contains(test2));
    }

    @Test public void testGraphAddEdge(){
        Graph graph = new Graph();
        Node test = graph.addNode("test");
        Node test2 = graph.addNode("test2");
        Node test3 = graph.addNode("test3");

        graph.addEdge(test, test2);
        graph.addEdge(test, test3);

        assertTrue(graph.getVertices().size() > 0);
    }

    @Test public void addEdge() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        assertTrue("Should be true", graph.addEdge(cat, dog));
        assertTrue("Should be true", graph.addEdge(cat, hamster));

    }

    @Test public void testBreadthFirst(){
        Graph graph = new Graph();
        Node pandora = new Node("pandora");
        Node arendelle = new Node("arendelle");
        Node metroville = new Node("metroville");
        Node monstroplolis = new Node("monstroplolis");
        Node narnia = new Node("narnia");
        Node naboo = new Node("naboo");

        //add neighbors
        HashSet<Node> neighbor1 = new HashSet<>();
        neighbor1.add(pandora);
        neighbor1.add(metroville);
        neighbor1.add(monstroplolis);
        arendelle.setNeighbors(neighbor1);

        HashSet<Node> neighbor2 = new HashSet<>();
        neighbor2.add(arendelle);
        pandora.setNeighbors(neighbor2);

        HashSet<Node> neighbor3 = new HashSet<>();
        neighbor3.add(arendelle);
        neighbor3.add(narnia);
        neighbor3.add(naboo);
        neighbor3.add(monstroplolis);
        metroville.setNeighbors(neighbor3);

        HashSet<Node> neighbor4 = new HashSet<>();
        neighbor4.add(arendelle);
        neighbor4.add(metroville);
        neighbor4.add(naboo);
        monstroplolis.setNeighbors(neighbor4);

        HashSet<Node> neighbor5 = new HashSet<>();
        neighbor5.add(metroville);
        neighbor5.add(naboo);

        HashSet<Node> neighbor6 = new HashSet<>();
        neighbor6.add(narnia);
        neighbor6.add(metroville);
        neighbor6.add(monstroplolis);

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(pandora);
        expected.add(arendelle);
        expected.add(metroville);
        expected.add(monstroplolis);
        expected.add(narnia);
        expected.add(naboo);

        assertEquals(expected, graph.breadthFirstTraversal(pandora));
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyGraphBreadthFirst(){
        Graph graph = new Graph();
        graph.breadthFirstTraversal(null);
    }

    @Test public void testOneValueGraph(){
        Graph graph = new Graph();
        Node pandora = new Node("pandora");

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(pandora);

        assertEquals(expected, graph.breadthFirstTraversal(pandora));
    }
}