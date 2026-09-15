/*

Example:
        String = Rama
        r -> 1
        a -> 2
        m -> 1
 */

import java.util.HashMap;
import java.util.Map;

public class Java_09_FindOccuranceOfEachCharacter {
    public static void main(String[] args) {
        String s = "Deepak";

        Map<Character, Integer> entry = new HashMap<>();

        for(Character ch : s.toLowerCase().toCharArray()){
            entry.put(ch, entry.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character, Integer> result: entry.entrySet()){
            System.out.println(result.getKey() + " -> " + result.getValue());
        }
    }
}
