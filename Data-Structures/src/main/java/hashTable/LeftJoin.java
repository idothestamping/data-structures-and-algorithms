package hashTable;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {
    public HashMap combineWords(HashMap input1, HashMap input2){
        HashMap<String, String> synonym = new HashMap<>(input1);
        HashMap<String, String> antonym = new HashMap<>(input2);
        HashMap<String, String> resultMap = new HashMap<>(synonym);

        for (Map.Entry<String, String> e : antonym.entrySet())
            resultMap.merge(e.getKey(), e.getValue(), String::concat);


//        for (String key : synonym.keySet()){
//            if(antonym.containsKey(key)){
//                resultMap.put(key, key.concat())
//            }
//        }



        return resultMap;
    }
}
