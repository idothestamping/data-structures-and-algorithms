package stacks_and_queues;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testStackNode() {
        Stack  newStack = new Stack();
        assertTrue("Should create empty stack", newStack.top == null);
    }
    @Test
    public void testStackPush() {
        Stack  newStack = new Stack();
        newStack.push(1);
        assertEquals("Should push a new node on stack", newStack.top.data, 1);
    }

    @Test
    public void testStackPop() {
        Stack  newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        assertEquals("Should pop node with value 2", newStack.pop(), 2);
        assertEquals("Node with value 1 should now be top", newStack.top.data, 1);
    }
}