package hashTable;

import java.util.HashMap;

import static hashTable.RepeatedWord.getFirstFrequentWord;

public class Main {

    public static void main(String[] args) {

//        Sample hashtable impl.
        HashTable ht = new HashTable(16);
        ht.add("John", "Husband");
        ht.add("Cathy", "Boss");
        ht.add("Amanda", "The Real Boss");
        ht.add("Allie", "Kid");
        ht.add("Zach", "Kid");
        ht.add("Rosie", "Dog");
        ht.add("Justin", "Student");
        ht.add("Demi", "Dog");
        ht.add("Ovi", "Student");
        ht.add("Ben", "Student");
        ht.add("Khalil", "Student");
        ht.add("Michael", "Student");
        ht.add("Timea", "Student");
        ht.add("Jason", "Student");
        System.out.println("done");

//        RepeatedWord, first found word: "Cannot"
        System.out.println(getFirstFrequentWord("Cannot wait until this is done, I just cannot wait!"));

//        LeftJoin
        HashMap str = new HashMap<>();
        str.put("big", "huge");
        str.put("big", "small");
    }




}