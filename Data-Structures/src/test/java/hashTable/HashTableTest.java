package hashTable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HashTableTest {

    @Test
    public void testHashTableInstantiation() {
        HashTable ht = new HashTable(10);
        assertEquals(10, ht.map.length);
    }

    @Test
    public void testHashTableAdd() {
        HashTable ht = new HashTable(10);
        ht.add("bubbles", "the value");
        assertEquals("the value", ht.get("bubbles"));
    }

    @Test
    public void testHashTableReturnNull() {
        HashTable ht = new HashTable(10);
        ht.add("bubbles", "the value");
        assertEquals(null, ht.get("bloop"));
    }

    @Test
    public void testHashTableHandleColl() {
        HashTable ht = new HashTable(10);
        ht.add("bubbles", "the value");
        ht.add("bubbles", "the second value");
        assertEquals("the second value", ht.get("bubbles"));

    }


    @Test
    public void testHashTableHandleCollRetreival() {
        HashTable ht = new HashTable(10);
        ht.add("bubbles", "the value");
        ht.add("bubbles", "the second value");
        assertEquals("the second value", ht.get("bubbles"));
        assertEquals("the value", ht.map[ht.hash("bubbles")].getNextNode().getValue());
    }
}
