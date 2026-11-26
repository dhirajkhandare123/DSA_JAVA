package medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class L_01_FirstElementwithUniqueFrequencySolv_Leetcode_3843 {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(Integer i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }

        Map<Integer, Integer> countFreq = new HashMap<>();

        for(int freq : map.values()){
            countFreq.put(freq, countFreq.getOrDefault(freq, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(countFreq.get(freq)==1){
                return num;
            }
        }

        return -1;

    }
}
