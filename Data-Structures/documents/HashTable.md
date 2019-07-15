# Hashtables
Implement hashTable which stores key-value pairs. Each key is unique but values can repeat but should be associated with a different key.

## Challenge
Implement hashTable with collision handling.

## Approach & Efficiency
The approach is to use arrays to store the keys and values. 
* add - method to add into the hashTable. Parameters are the key-value pair. 
* hash - method to return hashcode of the key. Returns integer value.
* contains - checks if the key exist in the table. Parameter is the key and it returns boolean.
* get - method that returns corresponding value of the key. Parameter is the key.
### Complexities
* add - O(n)
* hash - Average: O(1). Worst: O(n).
* contains - Average: O(1). Worst time: O(n).
* get - Average: O(1). Worst: O(n).

## Source Codes
* [HashTable](https://github.com/idothestamping/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/hashTable/HashTable.java)
