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

    @Test
    public void test_bfs(){
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        cat.addNeighbor(dog, 20);
        cat.addNeighbor(hamster, 40);

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(cat);
        expected.add(hamster);
        expected.add(dog);

        assertEquals("Should return", expected, graph.breadthFirstSearch(cat));
    }

    @Test
    public void test_dfs(){
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        cat.addNeighbor(dog, 20);
        cat.addNeighbor(hamster, 40);

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(cat);
        expected.add(dog);
        expected.add(hamster);

        assertEquals("Should return", expected, graph.depthFirstSearch(cat));
    }
}