# Hashtables
Implement hashTable which stores key-value pairs. Each key is unique but values can repeat but should be associated with a different key.

## Challenge
Implement hashTable with collision handling.

## Approach & Efficiency
The approach is to use arrays to store the keys and values. 

### Complexities
1. add - O(n)
2. hash - Average: O(1). Worst: O(n).
3. contains - Average: O(1). Worst time: O(n).
4. get - Average: O(1). Worst: O(n).

## API
1. add - method to add into the hashTable. Parameters are the key-value pair. 
2. hash - method to return hashcode of the key. Returns integer value.
3. contains - checks if the key exist in the table. Parameter is the key and it returns boolean.
4. get - method that returns corresponding value of the key. Parameter is the key.

## Source Codes
* [HashTable](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/hashTable/HashTable.java)
