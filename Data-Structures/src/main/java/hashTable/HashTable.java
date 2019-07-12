package hashTable;

public class HashTable {

    public Node[] map;

    public HashTable(int size) {
        map = new Node[size];
    }

    public int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    public void add(String key, String value) {
        int hashkey = hash(key);

        if (this.map[hashkey] == null) {
            map[hashkey] = new Node(key,value);
        }
        else {
            Node temp = map[hashkey];
            map[hashkey] = new Node(key,value);
            map[hashkey].setNextNode(temp);
        }
    }

    public String get(String key){
        int hashkey = hash(key);
        return map[hashkey] != null? map[hashkey].getValue() : null;
    }

    public boolean contains(String key){
        int hashkey = hash(key);
        return this.map[hashkey] != null;

    }
}