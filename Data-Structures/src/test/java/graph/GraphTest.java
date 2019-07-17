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
}