package hashTable;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LeftJoinTest {

    private LeftJoin test;
    private HashMap<String, String> first;
    private HashMap<String, String> second;
    private Map<String, String[]> expected;

    @Before
    public void init(){
        LeftJoin test = new LeftJoin();
        first = new HashMap<>();
        second = new HashMap<>();
        expected = new HashMap<String, String[]>();
    }
}