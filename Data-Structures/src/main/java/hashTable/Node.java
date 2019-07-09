package hashTable;

public class Node {

    private String key;
    private String value;
    private Node next;
    private Node nextNode;

    public void setNext(Node node, Node nextNode) {
        this.next = node;
        this.nextNode = nextNode;
    }

    public void setKey(String key) {
        this.key = key;
        this.nextNode = null;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node(String key, String value) {
        setKey(key);
        setValue(value);
    }

    public String getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    public Node getNext() {
        return next;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}