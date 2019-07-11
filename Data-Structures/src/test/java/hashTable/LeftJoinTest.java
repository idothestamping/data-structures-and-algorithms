package hashTable;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test
    public void testHashMap() {
        LeftJoin classUnderTest = new LeftJoin();

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        // Mapping string values to int keys
        map1.put("fond", "enamored");
        map1.put("wrath", "anger");
        map1.put("diligent", "employed");
        map1.put("outfit", "garb");
        map1.put("guide", "usher");

        // Mapping string values to int keys
        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        System.out.println(classUnderTest.combineWords(map1, map2));
    }
}