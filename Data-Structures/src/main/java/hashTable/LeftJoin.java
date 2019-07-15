package hashTable;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {

    Map<String, String[]> result = new HashMap<>();

    public Map<String, String[]> leftJoin(

            HashMap<String, String> synonym,
            HashMap<String, String> antonyms
    ) {

        if (synonym != null) {

            putMap(synonym); // map the string to compare

            antonyms.forEach((key, value) -> {
                String curKey = key.toLowerCase(); // lowercase it, prep it

                if (result.containsKey(curKey)) {
                    String[] values = result.get(curKey);  //declare found matched keys
                    if (value != null) {
                        values[1] = value.toLowerCase(); // lower case
                    }
                    result.put(key, values); // add the found matched keys to result
                }
            });
        }
        return result;
    }

    //helper method
    private void putMap(HashMap<String, String> input) {

        input.forEach((key, value) -> {
            if (value != null) {
                String[] values = new String[2];
                values[0] = value.toLowerCase();
                result.put(key.toLowerCase(), values);
            } else {
                result.put(key.toLowerCase(), new String[2]);
            }
        });
    }
}